import java.util.Scanner;

public class Palindrome {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the string: ");

	 String input = scanner.next().toLowerCase();
	 scanner.close();
//	 String back = "";
//	 for(int j=input.length()-1; j>=0; j--) {
//		 back += input.charAt(j);
//	 }
//	 if(back.equals(input)) {
//		 System.out.println("Palindrome");
//	 }
//	 else {
//		 System.out.println("Not a palindrome");
//	 }
	 boolean isPalindrome = true;
	 for(int i=0, j=1; i<input.length()/2; i++, j++) {
		 if(input.charAt(i) != input.charAt(input.length()-j)) {
			 isPalindrome = false;
			 break;
		 }
	 }
	 if(isPalindrome) {
		 System.out.println("Palindrome");
	 }
	 else {
		 System.out.println("Not a palindrome"); 
	 }
 }
}
