import java.util.Scanner;
	 
public class ChilToGoProfit {		
		
		
		    public static void main(String [] args) {
		        Scanner input = new Scanner(System.in);
		        float ProfitForAdult, ProfitForChild;
		        int No_adult ,No_child , TotalMeal ;
		        int TotalAdultMeal , TotChildMeal;

		        System.out.println("How many adult ordered for food?:");
		        No_adult=input.nextInt();
		        System.out.println("How many children ordered for food?:");
		        No_child= input.nextInt();

		        TotalAdultMeal= No_adult * 7;
		        TotChildMeal= No_child * 4;
		        TotalMeal = TotalAdultMeal + TotChildMeal;
		        System.out.println("Total meal ordered is $"+TotalMeal);

		        ProfitForAdult = 7 - 4.35f;
		        ProfitForChild = 4 - 3.10f;
		        System.out.println("Total meal ordered by adult is $"+TotalAdultMeal);
		        System.out.println("Total meal ordered by children is $"+TotChildMeal);
		        System.out.println("Profit gained for the Total Adult meal is $" +ProfitForAdult);
		        System.out.println("Profit gained for the Total Child Meal is $" +ProfitForChild);
		        float GrandTotalProfit = ProfitForAdult + ProfitForChild;
		        System.out.println("Total profit gained is $" +GrandTotalProfit);

		    }
		}


