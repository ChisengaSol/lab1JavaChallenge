package lab1JavaChallenge;
import java.util.*;

public class QuestionTwwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getting user input
		System.out.print("Enter string: ");
		
		Scanner strInput = new Scanner(System.in);
		String  rString = strInput.nextLine();
		
		//splitting the sentence into words
		String[] splitSentence = rString.split(" ");
		String reversedSentence = "";
		
		//getting word from the array
		for(int i =0 ; i< splitSentence.length; i++) {
			String word = splitSentence[i];
			String reversed = "";
			
		//reversing words from the array
		for(int j = word.length()-1;j>=0;j--) {
			
			reversed = reversed + word.charAt(j);
		}
		
		//forming the sentence from reversed words
		reversedSentence = reversedSentence + reversed + " ";
		


	}
		System.out.println(reversedSentence);

}
}