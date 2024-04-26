package ConversionMethods;

public class HexToBi {
	
	public static String hexadecimalToBinary(String hexString) {
		
		String decimal = HexToDec.hexToDecimal(hexString);
		String binary = DecToBi.decimalToBinary(decimal);
		
		return binary;	
		
	}

}