package calculatorProject;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b * 3;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int modulus(int a, int b) {
		return a % b;
	}


	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(12, 7));
		System.out.println(calc.subtract(12, 7));
		System.out.println(calc.multiply(12, 7));
		System.out.println(calc.divide(12, 7));
		System.out.println(calc.modulus(12, 7));

	}

}
