package practice;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		byte b=20;
		int c=a+b;   //implicit type casting
		System.out.println("implicit type casting-->result is "+c);
		
		int a2=10;
		byte b2=20;
		int c2=a2+(int)b2;   //explicit type casting-->widening
		System.out.println("explicit type casting- widening-->result is "+c2);
		
		int a1=10;
		byte b1=20;
		byte c1=(byte) (a1+b1);   //explicit type casting-->narrowing
		System.out.println("explicit type casting- narrowing-->result is "+c1);
	}

}
