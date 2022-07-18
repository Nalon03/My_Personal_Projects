import java.util.Scanner;
public class Egg_Test {
	
	
	public static void main(String[] arg)
	{
	Scanner input=new Scanner(System.in);
	
	double crate=20.50;
	double SingEgg=0.54;
	int IndiNotPart=94w;
	int ordered;
	int Numcrate;
	double LooseEggs=1.6;
	double TotAmount;
	float amount;
	double LooseEggsAmount;

	
	
	System.out.println("Enter The Number Of Eggs You Want To Order: ");
	ordered=input.nextInt();
	
	
	 int crate1= (ordered)/(38);
	 amount=(int) (SingEgg*ordered);
	 LooseEggsAmount=LooseEggs*IndiNotPart;
	 TotAmount=amount+LooseEggsAmount;
	 
	 
	 System.out.println("You ordered "+ordered+" chiken eggs. That's "+ crate1+" crates at "+amount+" and "+ LooseEggs+" loose eggs at Ghc "+LooseEggsAmount+", total amount is Ghc "+TotAmount);
	 
	 
	 
	
	
	
		
	}

}
