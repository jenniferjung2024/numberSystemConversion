package ConversionMethods;

public class DecToHex {
	
	public static String decimalToHexidecimal(String decimalString) {
		String hexString = "";
		
		int num =  GetintValue.stringToInt(decimalString);
			
		int remainder = num / 16;
		int hexValue = num % 16;
		
		hexString += HexMapping.mapHexValue(hexValue);
		
		while (remainder > 16) {
			hexValue = remainder % 16;
			hexString = HexMapping.mapHexValue(hexValue) + hexString;
			remainder = remainder / 16;
		}
		
		// get last remainder 
		hexValue = remainder % 16;
		hexString = HexMapping.mapHexValue(hexValue) + hexString;
		
		if (hexString.charAt(0) == '0')  // Binary number 1011 produces hexadecimal number 0B if this condition is not put in
			hexString = hexString.substring(1);

		return hexString;
	}

}
