
public class Conditional {

	static int x = 2;
	static int y = 3;
	
	public static void main(String[] args) {
		if (x <= y) {
			int x = 5;
			System.out.println("1) x = "+ x);
		} else {
			int y = 5;
			System.out.println("2) y = "+ y);
		}
		System.out.println("3) x = "+ x);
		System.out.println("4) y = "+ y);

		if (x <= y) {
			x = 5;
			System.out.println("5) x = "+ x);
		} else {
			y = 5;
			System.out.println("6) y = "+ y);
		}
		System.out.println("7) x = "+ x);
		System.out.println("8) y = "+ y);

		if (x <= y) {
			x = 5;
			System.out.println("9) x = "+ x);
		} else {
			y = 5;
			System.out.println("10) y = "+ y);
		}
		System.out.println("11) x = "+ x);
		System.out.println("12) y = "+ y);
	} // end of method main

} // end of class Conditional
