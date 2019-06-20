package multiply;

public class MultiplyStringSolution {
	public String multiply(String num1, String num2){
		int a = num1.length();
		int b = num2.length();
		
		int[] position = new int[a + b];
		
		for(int i = a - 1; i >= 0; i--){
			for(int j = b - 1; j >= 0; j--){
				int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = multiply + position[p2];
				
				position[p1] += sum / 10;
				position[p2] = sum % 10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int p : position){
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
