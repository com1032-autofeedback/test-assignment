package GradeCalculator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> students = List.of(
            Map.of("name", "Alice", "scores", List.of(85, 92, 78, 90, 88)),
            Map.of("name", "Bob",   "scores", List.of(55, 60, 58, 45, 70)),
            Map.of("name", "Carol", "scores", List.of(95, 98, 100, 92, 96))
        );

        List<Map<String, Object>> results = GradeCalculator.calculateGrades(students);
        results.forEach(System.out::println);
    }
}
