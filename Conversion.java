import java.util.*;
public class Conversion {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter your Choice");
                                  System.out.println("Press 1 for Binary");
                                  System.out.println("Press 2 for Octal");
                                  System.out.println("Press 3 for Hexadecimal");
		int c=s.nextInt();
		int[] b=new int[100];
		int[] o=new int[100];
		char[] h=new char[100];
		int i=0;
		int bn=n;
		int on=n;
		int hn=n;
		switch(c)
		{
		case 1 : while(bn!=0)
		{
			b[i]=bn%2;
			bn=bn/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(b[j]);
		}
		break;
		case 2 :  while(on!=0)
		{
			o[i]=on%8;
			on=on/8;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(o[j]);
		}
		break;
		case 3 :  while(hn!=0)
		{
			int temp=0;
			temp=hn%16;
			if(temp<10)
			{
				h[i]=(char)(temp+48);
				i++;
			}
			else
			{
				h[i]=(char)(temp+55);
				i++;
			}
			hn=hn/16;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(h[j]);
		}
		break;
		default : System.out.println("Wrong choice");

	}

}
}
