package practice;

public class SwitchPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java 13 new feature in switch
		char code='x';
		int val = switch (code) {
		case 'x', 'X':
		yield 1;
		case 'z', 'w':
		yield 2;
		default:
			throw new IllegalArgumentException("Unexpected value: " + code);
		};
		
		System.out.println(val);
	}

}
