import java.util.Scanner;

public class SocSecProcessor {

	public static void main(String[] args) {
		String name, socSecNumber;
		char nextChar;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Name? ");
		name = keyboard.nextLine();
		System.out.print("SSN? ");
		socSecNumber = keyboard.nextLine();

		do {
			try {
				if(isValid(socSecNumber)){
					System.out.print("Name: " + name + " SSN: " + socSecNumber);
				}
			}
			catch (SocSecException e){
				System.out.print("Name: " + name + " SSN entered: " + socSecNumber + e.getMessage());
			}

			System.out.print("Continue? ");
			nextChar = keyboard.next().charAt(0);
		} while (nextChar == 'y' || nextChar == 'Y');
		
		keyboard.close();

	}

	public static boolean isValid(String ssn) throws SocSecException {
		if(ssn.length() != 11) {
			throw new SocSecException("Incorrect length");
		}
		for(int x = 0; x < ssn.length(); x++) {
			if(x == 3 || x == 6) {
				if(ssn.charAt(x) != '-') {
					throw new SocSecException("Incorrect hyphen placement");
				}
			}
			else if(!Character.isDigit(x)) {
				throw new SocSecException("Non-numeric character");
			}
		}
		return true;
	}
}
