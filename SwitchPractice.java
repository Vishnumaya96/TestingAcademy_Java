package practice;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		final int X=20; // final variable |
		switch(a){
		case 'A':
			System.out.println("CHAR - A"); break;
		case 10:
		System.out.println("Sixty Five"); 
		case X:
		System.out.println("TWENTY"); 
		
		case 10+20+15:
		System.out.println("CONSTANT EXPR"); break;
		default :
		System.out.println("DEFAULT");
		}
		System.out.println("END");
	}

}
