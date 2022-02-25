
public class Scope {

	static int x = 3;
	
	public static void main(String[] args) {
		System.out.println("1: x = " + x);
		int x = 5;
		System.out.println("2: x = " + x);

		int y = calculate(x, 3);

		System.out.println("3: x = " + x);
		System.out.println("4: y = " + y);
	}

	static int calculate(int a, int b) {
		System.out.println("5: a = " + a);
		System.out.println("6: b = " + b);
		System.out.println("7: x = " + x);
		x-=1;
		System.out.println("8: x = " + x);
		int x = 8;
		System.out.println("9: x = " + x);
		x+=1;
		System.out.println("10: x = " + x);
		a+=1;
		System.out.println("11: a = " + a);
		System.out.println("12: b = " + b);
		System.out.println("13: x = " + x);
		return a + b*x;
	}
}
