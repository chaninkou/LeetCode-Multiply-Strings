package leetcode43;

public class Main {
	public static void main(String[] args){
		String num1 = "123";
		
		String num2 = "456";
		
		System.out.println("Output: num1 = " + num1 + " and num2 " + num2);
		
		MultiplyStringSolution solution = new MultiplyStringSolution();
		
		System.out.println("Answer: " + solution.multiply(num1, num2));
	}
}
