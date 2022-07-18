import java.util.Scanner;

public class Java_InterviewQuestions {

	public static void main(String args[]) {
		
		//ReverseStringForLoop();
		//ReverseStringWhileLoop();
		Swap2Nums();
		
		
	}
	
	
	public static void ReverseStringForLoop() {
		//A program to reverse a string without using String inbuilt function
		
		Scanner inp =new Scanner(System.in);
		
		String s;
		
		System.out.println("Enter a string");
		s=inp.nextLine();
		
		System.out.println("After reverse string:");
		
		for(int a=s.length();a>0;--a) {
			
			System.out.print(s.charAt(a-1));
		}
	}
	
	
	
	public static void ReverseStringWhileLoop() {
		Scanner inp =new Scanner(System.in);
		
		String s;
		System.out.println("Enter a string: ");
		s=inp.nextLine();
		
		System.out.println("After reverse tring:");
		
		int a=s.length();
		while(a>0)
		{
			System.out.print(s.charAt(a-1));
			a--;
		}
		
	}
	
	
	
	
	
	
	
	public static void Swap2Nums() {
		
		//A program to swap two numbers using a third variable
		
		Scanner inp =new Scanner(System.in);
		int x,y,d;
		System.out.println("Enter First Number:");
		x=inp.nextInt();
		
		System.out.println("Enter Second Number:");
		y=inp.nextInt();
		
		
		System.out.print("Before Swap "+ x+y);
		System.out.println(" ");
		
		d=inp.nextInt();
		System.out.print("After Swap "+ y+d);
		
	}
}




   

















