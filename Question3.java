package lab1JavaChallenge;
import java.util.*;
import java.text.DecimalFormat;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//takes radius as input from the user
		System.out.println("Enter radius: ");
		
		//assigns the radius  the value given by the user
		double radius = input.nextDouble();
		
		//calculates the are of the circle
		double area = Math.PI*radius*radius;
		
		//calculates the circumference of the circle
		double circumference = Math.PI*2*radius;
		
		//rounds results to two decimal places
		DecimalFormat df = new DecimalFormat("##.00");
		
		//prints the result
		System.out.print("The area is: "+df.format(area)+"\nThe circumference is: "+df.format(circumference));

	}

}
