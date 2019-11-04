import java.util.*;
public class addarray
 {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of row");
System.out.println("enter the number of column:");
int r1=s.nextInt();
int c1=s.nextInt();
int arr1[][] = new int [r1][c1];
for (int j=0;j<r1;j++)
	{
	for (int m=0;m<c1;m++)
		{
		arr1[j][m]=s.nextInt();
		}
	}
for (int j=0;j<r1;j++)
	{
	for (int m=0;m<c1;m++)
		{
		System.out.print(arr1[j] [m]   );
                                System.out.print(" ");
		}
	System.out.println();
	}
System.out.println("enter the number of rows1:");
System.out.println("enter the number of columns1:");
int r2=s.nextInt();
int c2=s.nextInt();
int arr2[][] = new int [r2][c2];
for (int j=0;j<r2;j++)
	{
	for (int m=0;m<c2;m++)
		{
		arr2[j][m]=s.nextInt();
		}
	}
for (int j=0;j<r2;j++)
	{
	for (int m=0;m<c2;m++)
		{
		System.out.print(arr2[j] [m]   );
                                System.out.print(" ");
		}
	System.out.println();
	}
if(r1==r2 && c1==c2)
{
for(int j=0;j<r1;j++)
{
for(int m=0;m<c1;m++)
System.out.print(arr1[j][m]+arr2[j][m]);
  System.out.print(" ");
 }
}
else
System.out.println("Addition is not possible");
		
}
}



