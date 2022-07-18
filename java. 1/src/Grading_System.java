import java.util.Scanner;

public class Grading_System {
	public static void main(String[] arg) {
		
		Scanner input=new Scanner(System.in);
		
		int project;
		int midsem;
		int quiz;
		int exam;
	    int presentation;
	    int result;
	    int grade;
	    
	    System.out.println("                                STUDENT GRADING SYSTEM  ");
	    System.out.println("                               ------------------------ ");
	    
	    System.out.println("Enter Project mark:(0-10) ");
	    project=input.nextInt();
	    System.out.println("Enter midsem mark:(0-20) ");
	    midsem=input.nextInt();
	    System.out.println("Enter quiz mark:(0-5) ");
	    quiz=input.nextInt();
	    System.out.println("Enter presentation mark:(0-15) ");
	    presentation=input.nextInt();
	    System.out.println("Enter exam mark:(0-50) ");
	    exam=input.nextInt();
	    
	    
	    result=(project+midsem+quiz+presentation+exam);
	    
	   
	    if(result>=0 && result<=45)
	    {
	    System.out.println("F");	
	    }
	    else if(result>45 && result <=50)
	    {
	    System.out.println("D");	
	    }
	    else if(result>50 && result<=55)
	    {
	    System.out.println("D+");
	    }
	    else if(result>55 && result<=60)
	    {
	    	System.out.println("C");
	    }
	    else if(result>60 && result<=65)
	    {
	    System.out.println("C+");	
	    }
	    else if(result>65 && result <=70)
	    {
	    	System.out.println("B");
	    }
	    else if(result>70 && result<=75)
	    {
	    	System.out.println("B+");
	    }
	    else if(result>80 && result<=85)
	    {
	    	System.out.println("A");
	    }
	    else if( result<85 && result<=100) 
	    {
	    System.out.print("A+");	
	    }
	    
	    else
	    {
	    	System.out.println("Wrong Input");
	    }
	    
	    
	    
	   result=(project+midsem+quiz+presentation+exam);
	    
	    
		
	}
	}


