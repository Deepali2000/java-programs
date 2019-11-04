class Student {
	public void show()
	{
	throw new ArithmeticException();
    }
}


public class demo14
{
		public static void main(String args[]){
		Student s=new Student();
		try
		{
			s.show();
		}
		catch(Exception e)
		{
			
        System.out.println(e);
		}
}
}
	 /*	
		{
			System.out.println();
			Student s=new Student();
			s.show();
		}
}
	*/	
			
/*			

try{
System.out.println("Inside try");
int =5/0;
}
catch (	Exception e){
	System.out.println("Inside catch");
	
}
finally{
	System.out.println("Inside finally");aea
}
}
*/