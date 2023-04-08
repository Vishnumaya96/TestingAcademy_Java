package practice;

public class IncrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//do increment after assignment
		System.out.println(a++);
		System.out.println("a++==>"+a);
		
		
		int b=10;
		//do increment before assignment
		System.out.println(++b);
		System.out.println("++b==>"+b);
	
		int c=10;
		System.out.println(++c);
		
		int d=10;
		System.out.println(d++);
		
		
		int e=10;
		System.out.println(++e+e++);
		System.out.println(e);
//		
//		
		int f=10;
		System.out.println(f++ + ++f);
		System.out.println(f);
	}

}
