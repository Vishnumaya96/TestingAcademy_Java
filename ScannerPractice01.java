package practice;

import java.util.Scanner;

public class ScannerPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		System.out.println("Your age is "+age);
		
		
		sc.close();
	}

}
