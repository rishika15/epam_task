package calculator;

public class Calculator {
	public double addition(String str) {
		String[] s=str.split("\\s");
		double sum=0;
		for(int i=0;i<s.length;i++) {
			sum+=Double.parseDouble(s[i]);
		}
		return sum;
	}
	
	public double multiplication(String str) {
		String[] s=str.split("\\s");
		double mul=1;
		for(int i=0;i<s.length;i++) {
			mul*=Double.parseDouble(s[i]);
		}
		return mul;
		
	}
	
	public double division(double a,double b) {
		if(b==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		else {
			return a/b;
		}
	}
}
