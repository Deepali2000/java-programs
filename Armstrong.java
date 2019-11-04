import java.util.*;

public class Armstrong
{
public static void main(String[] g)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no. to check whether it is armstrong or not");
int n=s.nextInt();
int a=n;
int r,sum=0;
while(a!=0)
{
r=a%10;
sum=sum+r*r*r;
a=a/10;
}
if(sum==n)
{
System.out.println("No. is Armstrong");
}
else
{
System.out.println("No. is not Armstrong");
}
}

}
