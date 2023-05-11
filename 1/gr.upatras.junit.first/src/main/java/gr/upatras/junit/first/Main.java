package gr.upatras.junit.first;
import java.io.*;

// Main class
public class Main {
        // Main driver method
        public static void main(String[] args)
        {		
        		String outcome;
                // Print statement
                System.out.println("Advanced Programming Lessons");
                Subtract s = new Subtract();
                outcome = s.sub(7, 2);
                System.out.println(outcome);
                System.out.println("END");
                
        }
        
        
}
