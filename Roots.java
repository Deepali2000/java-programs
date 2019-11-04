import java.lang.*;
import java.util.*;
public class Roots
{
public static void main(String[] g)
{
System.out.println("Enter 3 no.s of Quadratic Equation ax^2+bx+c=0");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d;
d=(b*b)-(4*a*c);
if(d<0)
{
System.out.println("Roots are Imaginary");
}
if(d>0)
{
System.out.println("Roots are Real");
}
if(d==0)
{
System.out.println("Roots are real and Equal");
}
}
}