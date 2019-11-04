import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main(String[] a)
    {
         System.out.println("Enter the No. to Find its Factorial");
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int f=1;
         for(int i=n;i>0;i--)
        { 
             f=f*i;
        }
        System.out.println("Factorial is " + f);
    }
}  
         