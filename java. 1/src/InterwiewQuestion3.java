import java.util.Scanner;

public class InterwiewQuestion3 {
	public static void main(String[] arg) {
		

		System.out.println("A Java program to find smallest and largest element in an array.");
		FindLargeSmallNumbers();
		
		System.out.println();
		System.out.println();
		 
		System.out.println("A Java program to find a factorial.");
		Factorial();
	}
	
	//Write a Java program to find smallest and largest element in an array.

	public static void FindLargeSmallNumbers() {
	int array[]=new int[] {12,56,76,22,5,78,98,100,234};
	int smallest=array[0];
	int largest=array[0];
	
	for(int i=1;i<array.length;i++) 
	{
		if(array[i]>largest)
        largest=array[i];
		else if(array[i]<smallest)
			smallest=array[i];	
	}

	System.out.println("Largest Number is: "+largest);
	System.out.println("Smallest Number is: "+smallest);
	
	}
	
    //Write a java program to find a factorial.
	public static void Factorial()
	{
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println("Enter a number: ");
	 int num=input.nextInt();
	 
	 int factorial=num;
	 
	 for(int a=(num-1);a>1;a--) {
		 factorial*=a;
	 }
	 System.out.println("Factorial of "+num + " is "+factorial);
	}

}



















