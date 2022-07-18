//Write a java program to find whether a string or number is palindrome or not

import java.util.Scanner;
public class InterviewQuest4 {

	public static void main(String[] arg) {
		Scanner inp =new Scanner(System.in);
	   
		String orig,reverse="";
		int len;
		System.out.println("Enter the numbers or strings: ");
		orig=inp.nextLine();
		
		len=orig.length();
		for(int a=len-1;a>=0;a--) {
			reverse+=orig.charAt(a);
		}
		System.out.println("Reverse is: "+reverse);
		
		if(orig.equals(reverse))
			System.out.println("The numbers are palindrome");
		else
			System.out.println("The numbers are not palindrome");
	}
}
