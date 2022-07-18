import java.util.Scanner;
public class AddMatrix {

	public static void main(String[] args)
	{
		Add();
	}
	
	public static void Add() {
		
		Scanner input=new Scanner(System.in);

		int Rsize = 8;
		int Csize=8;
		int row = 0 ,col = 0 ;
		int mat1[][]=new int[Rsize][Csize];
		int mat2[][] =new int[Csize][Rsize];
		int Result[][] =new int[row][col];
				
		System.out.println("Enter Number Of Rows:");
		row=input.nextInt();
		
		System.out.println("Enter Number Of Column:");
		col=input.nextInt();
		
		
		System.out.println("Enter The Elements for matrix 1["+ row +"]" +"["+col+"]");
		mat1[row][col]=input.nextInt();
		
		for( row=0;row<Rsize;row++){
			for(col=0;col<Csize;col++);
			
			 
			System.out.println();
			
		}
		
		System.out.println("Enter The Elements for matrix 2["+row+"]" +"["+col+"]");
		mat2[row][col]=input.nextInt();
		
		for(int i=0;i<Rsize;i++){
			for(int j=0;j<Csize;j++);
			
			System.out.println();
		}
		
		for(int i=0;i<Rsize;i++){
			for(int j=0;j<Csize;j++);
			Result[row][col]=mat1[row][col]+mat2[row][col];
			
			System.out.println(Result[row][col]);
	}
	
}
	}






