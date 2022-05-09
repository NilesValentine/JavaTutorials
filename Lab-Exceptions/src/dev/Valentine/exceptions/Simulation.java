package dev.Valentine.exceptions;

import java.util.Scanner;

public class Simulation {
	
	 public static void main(String[] args) {
	        getInput();
	    }

	 public static void getInput() throws EvenNumberException{
		    Scanner in = new Scanner(System.in);

		    //get input from user
		    System.out.println("Type in a number and press Enter...");
		  
		    String line = in.nextLine();
		    System.out.println("You've typed: " + line);

		    //test if number is even, throw exception if true
		    if (isEven(line)) {
		        try {
		            throw new EvenNumberException();
		        } finally {
		            in.close();
		        }
		    }

		    //close resources
		    in.close();
}
