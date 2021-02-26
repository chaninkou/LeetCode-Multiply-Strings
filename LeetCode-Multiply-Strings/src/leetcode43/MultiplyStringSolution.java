package leetcode43;

public class MultiplyStringSolution {
	public String multiply(String num1, String num2){
		int a = num1.length();
		int b = num2.length();
		
		int[] position = new int[a + b];
		
		// From right to left 
		for(int i = a - 1; i >= 0; i--){
			for(int j = b - 1; j >= 0; j--){
				// Get integer
				int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				
				// The index positions to store 
				int p1 = i + j, p2 = i + j + 1;
				
				int sum = multiply + position[p2];
				
				// To get the carry
				position[p1] += sum / 10;

				// To get the last digit of the multiply
				position[p2] = sum % 10;

			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int p : position){
			// Don't add any zero at the front
			if(!(sb.length() == 0 && p == 0)){
				sb.append(p);
			}
		}
		
		if(sb.length() == 0){
			return "0";
		}else{
			return sb.toString();
		}
	}
}
