package lab_exercise_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab_exercise_2 { 
	public static void main(String[] args) {
        File file = new File("file.txt");
        int lineNumber = 1;
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}


