package ConversionMethods;

public class HexToDec {
	
	public static String hexToDecimal(String hexString) {
		
		String decString = "";
		
		int num = 0;
		
        for (int i = 0; i < hexString.length(); i++) {
            
        	char digit = hexString.charAt(i);
            int digitValue;
            
            if (digit >= '0' && digit <= '9')
                digitValue = digit - '0'; // Convert digit '0' to '9'
            else 
                digitValue = digit - 'A' + 10; // Convert letter 'A' to 'F'
            
            num = num * 16 + digitValue;
            
        }
            
        decString += num;
        
        return decString;      
           
	}

}
