package lab_exercise_2;
public class lab_exercise_2 { 
    
	public class Main {
	    public static void main(String[] args) {
	        java.io.File f = new java.io.File("file.txt");
	        java.util.Scanner s = new java.util.Scanner(f);
	        int i = 1;
	        while(s.hasNextLine()) {
	            System.out.println(i + s.nextLine());
	            i++;
	        }
	    }
	}
}


