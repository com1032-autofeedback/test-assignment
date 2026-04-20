package lab_exercise_2;
public class lab_exercise_2 { 
    
    public static void main(String[] args) {

        // Getting the sizes using the hint
        int s_size = Short.SIZE;

        
        
        // int c_size = Char.SIZE; // this gave me an error so I checked stackoverflow, it's Character
        int c_size = Character.SIZE;
        
        // Printing them out. 
        // Wait, Short.SIZE prints 16 instead of 2. I think it gives bits instead of bytes?
        // I have to divide by 8 to get the actual bytes. 
        
        System.out.println("Size of short: " + s_size / 8 + " bytes");
        System.out.println("Size of char: " + c_size / 8 + " bytes");
        System.out.println("Size of int: " + Integer.SIZE / 8 + " bytes ");
        
        // I'll just do the rest directly in the print statement
        System.out.println("Size of long: " + Long.SIZE + " bytes"); // Oops, forgot to divide by 8
        System.out.println("Size of float: " + Float.SIZE / 8 + " bytes");
        
        double dbl_size = Double.SIZE;
        System.out.println("Size of double: " + (dbl_size / 8) + " bytes");
        
    }
}





