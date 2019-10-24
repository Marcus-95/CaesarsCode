import java.util.Scanner;

public class CaesarsCode {

	public static void main(String[] args) {
		
		// Method for ciphering a word
		cipher();
		
		//Method for deciphering a word
		deCipher();
			
		}
	
		public static void cipher () {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Write a word that shall be encrypted:");
			String text = input.nextLine().toUpperCase();
			
			
			// Loop that replaces the characters X,Y,Z with A,B,C
			
			for (int i = 0; i < text.length(); i++) {
				
				
				if(text.charAt(i) == 'X'){
					System.out.print('A');	
				}
				
				else if(text.charAt(i) == 'Y'){
					System.out.print('B');
				}
				
				else if(text.charAt(i) == 'Z') {
					System.out.print('C');
				}	
				else if(text.charAt(i) == ' ') {
					System.out.print(' ');
				}
				else {
					char cipher = text.charAt(i);
				
				/**
				 * Cipher that changes the char 3 steps FORWARD
				 * A to D, B to E etc
				 */
				 
				cipher += 3;
				
				System.out.print(cipher);	
			
		}
			}
	
	}
		
		public static void deCipher () {
			
			Scanner input2 = new Scanner(System.in);
			
			System.out.println("\nWrite the encrypted word:");
			String text = input2.nextLine().toUpperCase();
			
			/**
			 *  Loop that replaces the characters A,B,C with X,Y,Z 
			 *  Decipheres the encrypted word
			 */
		
			for (int i = 0; i < text.length(); i++) {
				
				if(text.charAt(i) == 'A'){
					System.out.print('X');	

				}
				
				else if(text.charAt(i) == 'B'){
					System.out.print("Y");
				}
				
				else if(text.charAt(i) == 'C') {
					System.out.print("Z");
				}
				
				else if(text.charAt(i) == ' ') {
					System.out.print(' ');
				}
				
				else {
					char cipher = text.charAt(i);
					
				// Cipher that changes the char 3 steps BACKWARDS
				cipher -= 3;
				
				System.out.print(cipher);	
		
		}
		
 }
		
}
}

