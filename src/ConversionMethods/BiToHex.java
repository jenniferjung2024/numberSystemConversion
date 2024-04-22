package ConversionMethods;

public class BiToHex {
	
	public static String binaryToHexadecimal(String binaryString) {
		
		String decimal = BiToDec.binaryToDecimal(binaryString);
		String hex = DecToHex.decimalToHexidecimal(decimal);
		
		return hex;	
		
	}

}
