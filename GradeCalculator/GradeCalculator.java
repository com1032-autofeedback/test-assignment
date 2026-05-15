package GradeCalculator;

import java.util.*;

public class GradeCalculator {

    public static List<Map<String, Object>> calculateGrades(List<Map<String, Object>> s) {
        List<Map<String, Object>> r = new ArrayList<>();

        for (Map<String, Object> x : s) {
            List<Integer> sc = (List<Integer>) x.get("scores");
            double t = 0;
            for (int i = 0; i < sc.size(); i++) {
                t = t + sc.get(i);
            }
            double avg = t / sc.size();
            avg = Math.round(avg * 100.0) / 100.0;

            String g;
            if (avg >= 90) {
                g = "A";
            } else if (avg >= 80) {
                g = "B";
            } else if (avg >= 70) {
                g = "C";
            } else if (avg >= 60) {
                g = "D";
            } else {
                g = "F";
            }

            Map<String, Object> res = new HashMap<>();
            res.put("name", x.get("name"));
            res.put("average", avg);
            res.put("grade", g);
            r.add(res);
        }

        r.sort((a, b) -> Double.compare((double) b.get("average"), (double) a.get("average")));
        return r;
    }
}

