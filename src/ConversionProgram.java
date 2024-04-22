import java.util.Scanner;
import ConversionMethods.*;

public class ConversionProgram {
		
	public static void main(String[] args) {
	
		Menu.printMenu();
		
		Scanner scnr = new Scanner(System.in);
		int userSelection = scnr.nextInt();
		
		while (userSelection != 4) {
			if (userSelection == 1) {
				System.out.print("Enter a binary number: ");
				String userInput = scnr.next();;
				boolean dataVal = true;
				
				for (int index = 0; index < userInput.length(); ++ index) {
					if (userInput.charAt(index) != '0' && userInput.charAt(index) != '1') {
						dataVal = false;
						break;
					}
				}
				
				while (!dataVal) {// check condition
					System.out.println("Incorrect value.");
					System.out.print("Enter a binary number: ");
					userInput = scnr.next();
					dataVal = true;  // reset value
					
					for (int index = 0; index < userInput.length(); ++ index) {
						if (userInput.charAt(index) != '0' && userInput.charAt(index) != '1') {
							dataVal = false;
							break;
						}
					}
				}
				
				String decimal = BiToDec.binaryToDecimal(userInput);
				String hex = BiToHex.binaryToHexadecimal(userInput);

				System.out.println("Binary number: " + userInput);
				System.out.println("Hexadecimal number: " + hex);
				System.out.println("Decimal number: " + decimal + "\n");
				Menu.printMenu();
				userSelection = scnr.nextInt();
				}		
			else if (userSelection == 2) {
				System.out.print("Enter a hexadecimal number: ");
				String userInput = scnr.next();
				boolean dataVal = true;
				
				for (int index = 0; index < userInput.length(); ++ index) {
					if (! ((userInput.charAt(index) >= '0' && userInput.charAt(index) <= '9') ^ userInput.charAt(index) >= 'A' && userInput.charAt(index) <= 'F' )) {
						dataVal = false;
						break;
					}
				}
				
				while (!dataVal) {// check condition
					System.out.println("Incorrect value.");
					System.out.print("Enter a hexadecimal number (capitalize letters A-F): ");
					userInput = scnr.next();
					dataVal = true;  // reset value
					
					for (int index = 0; index < userInput.length(); ++ index) {
						if (! ((userInput.charAt(index) >= '0' && userInput.charAt(index) <= '9') ^ userInput.charAt(index) >= 'A' && userInput.charAt(index) <= 'F' )) {
							dataVal = false;
							break;
						}
					}
				}
				
				System.out.println("Hexadecimal number: " + userInput);
				System.out.println("Binary number: [binary-number]");
				System.out.println("Decimal number: [decimal-number]\n");
				Menu.printMenu();
				userSelection = scnr.nextInt();
				}
			else if (userSelection == 3) {
				System.out.print("Enter a decimal number: ");
				String userInput = scnr.next();
				boolean dataVal = true;
				
				for (int index = 0; index < userInput.length(); ++ index) {
					if (!(userInput.charAt(index) >= '0' && userInput.charAt(index) <= '9')) {
						dataVal = false;
						break;
					}
				}
				
				while (!dataVal) {// check condition
					System.out.println("Incorrect value.");
					System.out.print("Enter a decimal number: ");
					userInput = scnr.next();
					dataVal = true;  // reset value
					
					for (int index = 0; index < userInput.length(); ++ index) {
						if (!(userInput.charAt(index) >= '0' && userInput.charAt(index) <= '9')) {							dataVal = false;
							break;
						}
					}
				}
				
				String hex = DecToHex.decimalToHexidecimal(userInput);
				
				System.out.println("Decimal number: " + userInput);
				System.out.println("Binary number: [binary-number]");
				System.out.println("Hexadecimal number: " + hex + "\n");
				Menu.printMenu();
				userSelection = scnr.nextInt();
			}
			else {
				System.out.println("Incorrect selection.  Please choose again.\n");
				Menu.printMenu();
				userSelection = scnr.nextInt();
			}
		}
		
		if (userSelection == 4) {
			System.out.println("Goodbye");
		}		
		
		scnr.close();
		
	}
}
