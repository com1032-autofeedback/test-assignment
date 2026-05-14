package lab_exercise_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab_exercise_2 { 
	public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java ReadFile <filename>");
            System.exit(1);
        }

        String filename = args[0];
        int lineNumber = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}


