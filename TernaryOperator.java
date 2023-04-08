package practice;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=true?10:20;
		
		int b1=false?10:20;
		
		System.out.println(a1);
		System.out.println(b1);
		
		
		double a= 20 > 10 ?10.0: 20.0; // a=10.0
		System.out.println(a);
		double d=20 > 10 ? 10.0: 20.0;//10.0 WILL BE DISPLAYED
		//int x= 10 > 20 ? 10: "TWENTY";//both should be same data type
		String str= 10 > 20 ? "10" : "TWENTY";//TWENTY WILL BE DISPLAYED
	}

}
