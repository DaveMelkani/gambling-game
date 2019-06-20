
import java.util.*;
public class Practice {


	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Welcome! Please enter your name!");
		String userName = in.nextLine();
		System.out.println("Please enter the passcode of the user " + userName + ".");
		int passcodeFromUser = in.nextInt();
		int passcode = 1234;
		if (passcodeFromUser == passcode) {
			System.out.println("Welcome " + userName + "!");
			Random random = new Random(userName.hashCode());
			System.out.println("Here are your random numbers:");
			System.out.println(random.nextInt(100) + ", " + random.nextInt(100) + ", " + random.nextInt(100));
		}
		else {
			Random random = new Random(userName.hashCode());
			System.out.println("Access denied!");
			System.out.println("Here's an odd random number for you...");
			System.out.println(random.nextInt(5)+10); //has 0,1,2,3,4 +10 for each
		}
	
		
	}
}
