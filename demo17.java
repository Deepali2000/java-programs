import java .util.*;
import java .io.*;
class ArrayList{
	private int data[];
	private int size;
    private  int count;
	
	public ArrayList(int size){
		data=new int[size];
		this.size=size;
		this.count=0;
   }
   
   public void add(int value)
   {
        if(this.count==this.size){
	  data=new int[this.size*2];
	  this.size=this.size*2;
        }
		else{
			data[this.count]=value;
			this.count++;
		}
   }
   
   public void show()
     {
	   for(int i=0;i<this.count;i++)
	   {
			System.out.println(data[i]);
			
	   }
	 }
}

public class demo17
{
	public static void main(String args[]){
	ArrayList list=new ArrayList(5);
      list.add(10);
      list.add(20); 
	  list.add(30); 
	  list.add(40);
	  list.add(50);
      list.show();
	}
}
   