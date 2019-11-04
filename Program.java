import java.util.*;
public class Program
{
public static void main(String[] g)
{
System.out.println("Press the following no. as per ur choice");
System.out.println("1. To print Fibbonacci series upto 50 terms");
System.out.println("2. To find Factorial of a given No.");
System.out.println("3. To check Whether the No. is Palllindrome or not");
System.out.println("4. To check Whether the No. is Armstrong  or not");
Scanner s=new Scanner(System.in);
int ch=s.nextInt();
switch(ch)
{
case 1 :  { long a=0L,b=1L;
                 System.out.println(a);

	System.out.println(b);

	long c;
		
                 for(int i=0;i<48;i++)	
                {
		
                    c=a+b;

                   System.out.println(c);

                    a=b;
  
                    b=c;
		
                }

              }
               break;
case 2 :  {System.out.println("Enter the No. to Find its Factorial");
         int n=s.nextInt();
         int f=1;
         for(int i=n;i>0;i--)
        { 
             f=f*i;
        }
        System.out.println("Factorial is " + f);}
        break;
case 3 : {System.out.println("Enter the no. to check it pallindrome");
int no=s.nextInt();
int p=no;
int r;
int rev=0;
while(p!=0)
{
r=p%10;
rev=rev*10+r;
p=p/10;
}
if(rev==no)
{
System.out.println("No. is Pallindrome");
}
else
{
System.out.println("No. is not Pallindrome");
}
}
 break;
case 4 : {System.out.println("Enter the no. to check whether it is armstrong or not");
int ng=s.nextInt();
int a=ng;
int r,sum=0;
while(a!=0)
{
r=a%10;
sum=sum+r*r*r;
a=a/10;
}
if(sum==ng)
{
System.out.println("No. is Armstrong");
}
else
{
System.out.println("No. is not Armstrong");
}
}
 break;
default : System.out.println("Wrong option");
}
}
}
     