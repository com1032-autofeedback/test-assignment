package lab_exercise_2;
import java.io.File;

public class lab_exercise_2 { 
	public class Main {
	    public static void main(String[] args) {

	        File file = new File("file.txt");

	        int lineNumber = 1;

	        // read the file somehow
	        while (file != null) {
	            System.out.println(lineNumber + ": " + file);
	            lineNumber++;
	        }
	    }
	}
}



