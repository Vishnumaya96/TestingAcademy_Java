package practice;

public class SwitchPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK 13
		int itemCode=004;
		switch (itemCode) {
		case 001, 002, 003:
			System.out.println("It's an electronic gadget!");
			break;
		case 004, 005:
			System.out.println("It's a mechanical device!");
			break;
			
		default:
			System.out.println("Its a software product");
		}
	}

}
