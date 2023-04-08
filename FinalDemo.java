package practice;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14;
		System.out.println(pi);
		
		//pi=22/7; //cannot reassign as pi is declared as final
		//System.out.println(pi);
		
		double d=pi*2;
		System.out.println(d);
	}

}
