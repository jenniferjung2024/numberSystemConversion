package ConversionMethods;

public class DecToHex {
	
	public static String decimalToHexidecimal(String decimalString) {
		String hexValue = "";
		
		int num =  GetintValue.stringToInt(decimalString);
			
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
		
		if (hexValue.charAt(0) == '0')  // Binary number 1011 produces hexadecimal number 0B if this condition is not put in
			hexValue = hexValue.substring(1);

		return hexValue;
	}

}
