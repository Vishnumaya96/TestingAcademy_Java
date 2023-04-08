package practice;

public class SwitchPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45; //
		final int X=20; // final variable, Constant
		//X = 30; // Error: cannot assign a value to final variable X
		switch(a){
		case 10:
		System.out.println("TEN"); break;
		case X:
		System.out.println("TWENTY"); break;
		case 'A':
		System.out.println("CHAR - A");
		case 10+20+15:
		System.out.println("CONSTANT EXPR"); break;
		default :
		System.out.println("DEFAULT");
		}
		System.out.println("END");
	}

}
