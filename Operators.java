package practice;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unary plus operator
		int a=+14;
		System.out.println("a is 14 or not??--> "+a);
		
		//unary minus operator
		int ab=-14;
		System.out.println("ab is -14 or not??--> "+ab);
		
		
		int abc=-+14;
		System.out.println("abc is 14 or not??--> "+abc);
		
		int abcd=+-14;
		System.out.println("abcd is 14 or not??--> "+abcd);
		
		//below two are invalid because it is already increment/decrement operator define
//		int abcde=--14;
//		System.out.println("a is 14 or not??--> "+abcde);
//		
//		int abcdef=++14;
//		System.out.println("a is 14 or not??--> "+abcde);
		
		//logical complement operator-->used either with boolean value or conditions
		boolean b=!true;
		System.out.println("boolean b is "+b);
		
		boolean bt=!false;
		System.out.println("boolean bt is "+bt);
		
		boolean cd=!true;
		if(cd!=true) {
			System.out.println("value of cd is "+cd);
		}
		
		
		boolean ed=!!!true;
		System.out.println("value of ed is "+ed);
		
		//bitwise complement
		int g=5;
		System.out.println("~g is "+~g);
		
		//binary operator
		int a1=10;
		int b1=20;
		int c1=a1+b1;
		int c2=a1-b1;
		int c3=a1*b1;
		double c4=(double)a1/b1;
		int c5=a1%b1;
		
		System.out.println("+ operator -->"+c1);
		System.out.println("- operator -->"+c2);
		System.out.println("* operator -->"+c3);
		System.out.println("/ operator -->"+c4);
		System.out.println("% operator -->"+c5);
		
		byte a12 = 10;
		byte b12 = 20;
		byte c12= (byte) (a12 + b12); // result is promoted to integer, so we need to cast back to byte
		System.out.println(c12); // output: 30

		//increment operator
		
	}
}
