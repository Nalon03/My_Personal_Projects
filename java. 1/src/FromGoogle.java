import java.util.Scanner;
public class FromGoogle {

	public static void main(String[] arg) {
		FromGoogle.UserInput();
		
		
	}
	public static void NoInput() {
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.println(c[i][j]+" ");
			}
		}
		   System.out.println();
		
	}
	public static void UserInput() {
		
		Scanner input=new Scanner(System.in);
		
		int p,q,m,n;
		System.out.println("Enter the number of rows in the first matrix: ");
		p=input.nextInt();
		System.out.println("Enter the number of column in the first matrix: ");
		q=input.nextInt();
		System.out.println("Enter the number of rows in the second matrix: ");
		m=input.nextInt();
		System.out.println("Enter the number of column in the second matrix: ");
		n=input.nextInt();
		
		if(p==q&&m==n) {
			
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			int c[][]=new int[m][n];
			
			System.out.println("Enter all the element in the first matrix: ");
			 for(int i=0; i<p; i++) {
				 for(int j=0; j<q;j++) {
					 
					 a[i][j]=input.nextInt();
				 }
			 }
		
			 System.out.println("Enter all the element in the second matrix: ");
			 for(int i=0; i<m; i++) {
				 for(int j=0; j<n;j++) {
					 
					 b[i][j]=input.nextInt();
				 }
			 }
			 System.out.println("");
			 
			 System.out.println("Enter all the element in the first matrix: ");
			 for(int i=0; i<p; i++) {
				 for(int j=0; j<q;j++) {
					 
				  System.out.print(a[i][j] +" ");
				 }
			     System.out.println("");
			 }
		
			 System.out.println("Enter all the element in the first matrix: ");
			 for(int i=0; i<m; i++) {
				 for(int j=0; j<n;j++) {
					 
				  System.out.print(b[i][j] +" ");
				 }
			     System.out.println("");
			 }
		
			 for(int i=0;i<p; i++) {
				 
				 for(int j=0;j<n;j++) {
					 
					 for (int k=0; k<q;k++) {
						 
						 c[i][j]=a[i][j]*b[i][j];
					 }
				 }
			}
			 
			 
			 System.out.println("Matrix After:");
        for(int i=0;i<p; i++) {
				 
         for(int j=0;j<n;j++) {
        	 System.out.print(c[i][j]+" ");
         }
         System.out.println("");
		}

		}
	
		else {
			System.out.print("Not Possible");
			System.out.print("Try Again");
		}
	}
	
}

























