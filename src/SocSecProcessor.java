import java.util.Scanner;

public class SocSecProcessor {
	
	public static void main(String[] args) {
		String name, socSecNumber;
		char nextChar;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Name? ");
				name = keyboard.nextLine();
				System.out.print("SSN? ");
				socSecNumber = keyboard.nextLine();
			}
			catch (new SocSecException()){
				
				
			}
			
			System.out.print("Continue? ");
			nextChar = keyboard.next().charAt(0);
		} while (nextChar == 'y' || nextChar == 'Y');
		
	}
}
