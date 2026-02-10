package src.learning;
import java.util.Scanner;
public class Matrix {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter number of columns");
		int cols=sc.nextInt();
		
		int [][] matrix1 = new int[rows][cols];
		int [][] matrix2 = new int[rows] [cols];
		int [][] sum=new int[rows][cols];
		
		System.out.print("Enter element of first matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
	}
	
}
