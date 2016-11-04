import java.util.Scanner;

/**
 * 
 */

/**
 * @author q.ronnmark
 *Name: Quenton Ronnmark
 *Teacher: Mr.Hardman
 *Assignment 3 part 1
 *Nov. 4th 2016
 */
public class Averagecalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		double firstMark;
		double secondMark;
		double thirdMark;
		double fourthMark;
		double fifthMark;
		double average;
		
		System.out.println("First Mark: ");
		firstMark = userInput.nextDouble();
		
		System.out.println("Second Mark: ");
		secondMark = userInput.nextDouble();
		
		System.out.println("Third Mark: ");
		thirdMark = userInput.nextDouble();
		
		System.out.println("Fourth Mark: ");
		fourthMark = userInput.nextDouble();
		
		System.out.println("Fifth Mark: ");
		fifthMark = userInput.nextDouble();
		
		average = (firstMark + secondMark + thirdMark + fourthMark + fifthMark);
		
		System.out.println( String.format("%15s %10.2f", "Mark one:", firstMark) );
		
		System.out.println( String.format("%15s %10.2f", "Mark two:", secondMark) );
		
		System.out.println( String.format("%15s %10.2f", "Mark three:", thirdMark) );
		
		System.out.println( String.format("%15s %10.2f", "Mark four:", fourthMark) );
		
		System.out.println( String.format("%15s %10.2f", "Mark five:", fifthMark) );
		
		System.out.println( String.format("%15s %10.2f", "Average:", average) );
		
		userInput.close();
	}

}
