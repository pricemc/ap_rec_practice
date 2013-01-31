/**************************************************************
 * 
 * 	palindrome
 * 
 * 		checks if palindrome
 * 
 **************************************************************/

class palindrome {
	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the string to check
	 */
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Please type a string after palindrome the next time you run this program.");
			System.exit(0);
		}	
		String n = args[0];
		boolean palindrome = iterativePalindrome(n);
		if(palindrome) {
			System.out.println("The string " + n + " is a palindrome.");
		}else{
			System.out.println("The string " + n + " is not a palindrome.");
		}


	}
	public static boolean iterativePalindrome(String n) {

	}
	public static boolean recursivePalindrome(String n) {
		
	}


}