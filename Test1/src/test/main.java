package test;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		  // declare vartiables
        
        // this is the input param    
        int x = 0;
        
        // this is the input reader
        Scanner reader = new Scanner(System.in);
        
        // this is our name array
        String[][] names = { {"Dad", "Jef"},
                               {"Maddy", "ButtFace", "Belle", "Ada"},
                               {"Goku", "Buu"}};
        
        
        String[][] name = { {"Bob", "Jeff", "Luffy"}};
        
        
        
        // this is our name array
        String[][] jeffNames = { {"Luffy", "Goku", ""},
                               {"Maddy", "ButtFace", "Belle", "Ada"},
                               {"Goku", "Buu"}};
        
        
        
        
        // this controls the number of times the program asks the user to input a number
        for(int i =0; i < 8; i++)
        {
             System.out.println("Enter a number : ");
             int n = reader.nextInt(); // Scans the next token of the input as an int.
             
            if(n == 1)
            {
                // this is calling the function print
                printJax();
            }
            else if(n == 8)
            {
               printJax();
            }
         }

   	 // this is the program end
   	 System.out.println("done program");
 }
 
 // this is a function
 private static void print(String param1, int n)
 {
	 for(int i = 0; i < n; i = i + 1)
     {
		 System.out.println(param1 + n);
     }
 }
 
 private static void printJax()
 {
	 System.out.println("Jaxon");
     
 }
 
}
