//This is just gonna give you back what you said! 

import java.util.Scanner;

class Echo{
	public static void main(String[] args) {
		String sentence; 
		Scanner scan = new Scanner(System.in);

		System.out.println("Tell me something: ");
		sentence = scan.nextLine();

		System.out.println("You said: " + sentence);
	}
}