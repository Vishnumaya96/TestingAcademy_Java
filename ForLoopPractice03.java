package practice;

public class ForLoopPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5; i++){
			for(int j=1;j<=3; j++){
				if(i==3)
					continue;
				System.out.println(i+"\t"+j);
			}
			System.out.println();
	}
	}
}
