package gettingUserInput_L11;

import java.util.Scanner;

public class app {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	System.out.println("Input your text : ");
	String line=input.nextLine();
	
	System.out.println(line);
	}
}
