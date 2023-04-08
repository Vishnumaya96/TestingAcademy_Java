package practice;

public class StringPractice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Maya";
		String name1="Maya";
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		
		String name2=new String("Maya");
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		
		String name3="maya";
		System.out.println(name==name3);
		System.out.println(name.equalsIgnoreCase(name3));
		
	}

}
