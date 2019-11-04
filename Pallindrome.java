import java.util.*;
public class Pallindrome
{
 public static void main(String[] g)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no. to check it pallindrome");
int n=s.nextInt();
int p=n;
int r;
int rev=0;
while(p!=0)
{
r=p%10;
rev=rev*10+r;
p=p/10;
}
if(rev==n)
{
System.out.println("No. is Pallindrome");
}
else
{
System.out.println("No. is not Pallindrome");
}

}
}

