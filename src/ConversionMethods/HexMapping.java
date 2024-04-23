package ConversionMethods;

public class HexMapping {

	public static String mapHexValue(int rem) {
	
		String hexValue = "";
		
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
