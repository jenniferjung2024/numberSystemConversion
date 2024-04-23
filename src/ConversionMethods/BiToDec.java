package ConversionMethods;

public class BiToDec {
	
	public static String binaryToDecimal(String binaryString) {
		
		int num = GetintValue.stringToInt(binaryString);
		
        int ans = 0, rem = 0;
        
        int i = 0;
        
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            ans += rem * Math.pow(2, i);
            i++;
        }
				
		String decValue = "" + ans;
		
		return decValue;
	}

}
