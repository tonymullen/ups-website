import java.util.Scanner;
import java.util.Random;

public class DMV{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        
        // In CA, the wait time is always a random number between 3 and 10 hours...
        System.out.println("Welcome to the DMV (estimated wait time is " + (rng.nextInt(8)+3) + " hours)");

        System.out.println("\nEnter first, middle, and last name:");
        String name = input.nextLine();
        int lastSpace = name.lastIndexOf(' ');        
        String firstMiddle = name.substring(0,lastSpace);
        String last = name.substring(lastSpace+1);
        
        
        System.out.println("\nEnter date of birth (MM/DD/YY):");
        String birthdate = input.nextLine();        
        String allButYear = birthdate.substring(0,6);
         
        final int RANGE = 9000000;
        final int OFFSET = 1000000;
        int id = rng.nextInt(RANGE) + OFFSET;
        
        
        System.out.println("-------------------------------------");
        System.out.println("Washington Driver License");
        System.out.println("DL " + id); 
        System.out.println();
        System.out.println("LN " + last);
        System.out.println("FN " + firstMiddle);
        System.out.println("DOB " + birthdate);
        System.out.println("EXP " + allButYear + "20");
        System.out.println("-------------------------------------");
    }
}
