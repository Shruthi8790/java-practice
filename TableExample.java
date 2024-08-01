import java.util.Scanner;
	public class TableExample {
public static void main(String[] args) {
/* declaration of a table having 3 rows and 5 columns--*/
  int[][] table;
/*---initializing number of rows and columns---*/
  table=new int[3][5];
/*----index variable for row and column---*/
   int row,col;
/*---creating objecct for Scanner class--*/
	Scanner sc=new Scanner(System.in);
/*--input of data through keyboard----*/
	System.out.println("Ente number for atable having 3 rows and 5 columns:");
	for(row=0;row<3;row++)
	{
	   for(col=0;col<5;col++)
		{
		   table[row][col]=sc.nextInt();
		}
	}
	System.out.println("Elements of Table:");
	for(row=0;row<3;row++)
	{
	   for(col=0;col<5;col++)
	    {
		   System.out.print(table[row][col]+"\t");
	   }
/*--change line for next row--*/
      System.out.println();
    }
 }
}


