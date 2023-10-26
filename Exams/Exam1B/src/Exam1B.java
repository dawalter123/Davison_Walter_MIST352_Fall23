 /*Davison_Walter 
  * 9/29/23
  * Exam 1 Part B 
  * This program greets the user, asks them for input. 
  * The program prints the length of the input. 
  * It asks the user for a character from their input. 
  * The program finds the location of the character within the input. 
  */

import java.util.Scanner;
public class Exam1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello!");
Scanner var = new Scanner(System.in);
System.out.println("Enter username");

String userName = var.nextLine();
System.out.println("Input is: " + userName);
System.out.print("Input length is: ");
System.out.println(userName.length());
System.out.println("Enter a character in your input");
String username = var.nextLine();
System.out.println("Location is: ");



		
	}

}