package practice;

public class StringPractice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The Testing Academy";
		System.out.println(s1.length());
		System.out.println(s1.charAt(6));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 8));
		System.out.println(s1.indexOf('e'));
		String s2="Testing";
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf('A', 2));
		System.out.println(s1.indexOf("Aca",12));
		System.out.println(s1.lastIndexOf('B'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.contains("Aca"));
		System.out.println(s1.contains("maya"));
	
	}

}
