package ConversionMethods;

public class DecToHex {
	
	public static String decimalToHexidecimal(String decimalString) {
		String hexValue = "";
		
		int num =  GetintValue.stringToInt(decimalString);
		
		System.out.println(num);
		
		int firstValue = num / 16;
		int rem = num % 16;
		hexValue += firstValue;
		
		if (rem < 10) {
			hexValue = hexValue + rem;
		}
		else {
			// map out A-F
			
			char charValue = (char) ('A' + (rem - 10));
			
			hexValue = hexValue + charValue;			
		}			

		return hexValue;
	}

}
