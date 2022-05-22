package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int add = obj.add(50, 100, 21);
		int sub = obj.sub(45, 25);
		double mul = obj.mul(25.08, 35.06);
		float div = obj.div(25, 5);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}

}
