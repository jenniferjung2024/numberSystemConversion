package ConversionMethods;

public class DecToBi {
	
	public static String decimalToBinary(String decimalString) {
		String binaryString = "";
		
		int num =  GetintValue.stringToInt(decimalString);
			
		int remainder = num / 2;
		int binaryValue = num % 2;
		binaryString += binaryValue;
		
		while (remainder > 1) {
			binaryValue = remainder % 2;
			binaryString = binaryValue + binaryString;
			remainder = remainder / 2;
		}
		
		// get last remainder 
		binaryValue = remainder % 2;
		binaryString = binaryValue + binaryString;
		
		while (binaryString.length() % 8 != 0) { // keep correct format of binary number
			binaryString = "0" + binaryString;
		}

		return binaryString;
	}

}

