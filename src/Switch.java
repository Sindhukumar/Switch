import java.util.Scanner;

public class Switch {

	public static void main(String args[]){
		System.out.println("Enter the exact number of days in the month.");
		Scanner sc = new Scanner(System.in);
		int numOfDays = sc.nextInt();
		switch(numOfDays){
		case 30:
			System.out.println("September April June November");
			break;
		case 31:
			System.out.println("January March May July August October December");
			break;
		case 29:
			System.out.println("Febrarury");
			break;
		case 28:
			System.out.println("Febrarury");
			break;
		default:
			System.out.println("No months have exactly "+ numOfDays +" of days");
			 
		}
		sc.close();
	}
}
