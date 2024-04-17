package ConversionMethods;

public class GetintValue {
	
	public static int stringToInt(String str) {
		int integerValue = 0;
		
		for (int index = 0; index < str.length(); ++index) {
			char c = str.charAt(index);
			int digit = c - '0';
			integerValue = integerValue * 10 + digit;
		}
		
		return integerValue;
	}
}
