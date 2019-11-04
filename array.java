import java.util.*;
public class array
 {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of rows:");
System.out.println("enter the number of columns:");
int n=s.nextInt();
int i=s.nextInt();
int arr[][] = new int [n][i];
for (int j=0;j<n;j++)
	{
	for (int m=0;m<i;m++)
		{
		arr[j][m]=s.nextInt();
		}
	}
for (int j=0;j<n;j++)
	{
	for (int m=0;m<i;m++)
		{
		System.out.print(arr [j] [m]   );
                                System.out.print(" ");
		}
	System.out.println();
	}	
}
}



