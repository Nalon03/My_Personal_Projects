import java.util.Scanner;
public class InterviewQuestion2 {
	public static void main(String[] arg)
	{
		
		Fibonacci();
	}
	
	public static void Fibonacci()
	{
		//Write a Java program for the Fibonacci series
		
		
		int number;
		int a=0;
		int b=0;
		int c=1;
		
		Scanner UserInput=new Scanner (System.in);
		System.out.print("Enter Number of Time: ");
		number=UserInput.nextInt();
		
		System.out.print("Fabonacci series of the number is: ");
		for(int z=0; z<=number;z++) {
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(a+ " ");
		}
	}
}
