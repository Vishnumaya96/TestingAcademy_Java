package practice;

public class CharacterIsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		if(c>=65 && c<=90 || c>=97 && c<=122){
			switch(c) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("character is a vowel");
					break;
				
				default:
					System.out.println("character is consonant");
			}
		}
		
		else
			System.out.println("Invalid character");
	}

}
