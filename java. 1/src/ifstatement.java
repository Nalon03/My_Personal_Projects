import java.util.*;


public class ifstatement {
   
	public static void main(String[] args )
	{
	int age;	
		
	Scanner userInput=new Scanner(System.in);
	System.out.println("Enter Your Age: ");
	age=userInput.nextInt();
	
	if(age<=40)
	{
		System.out.println("You Are Young");
		
	}
	
	else
	{
		System.out.println("You Are Old");
		
	}
	
	
	}
}
