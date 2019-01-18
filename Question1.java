package lab1JavaChallenge;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variable input
		Scanner input;
		
		//getting string input
		System.out.print("Enter string: ");
		input = new Scanner(System.in);
		
		//storing user input and finding the length
		int strLength = input.nextLine().length();
		
		//Printing the length
		System.out.println("The length of th string is: " + strLength);

	}

}
