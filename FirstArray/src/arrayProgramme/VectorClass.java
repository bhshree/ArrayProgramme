package arrayProgramme;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass 
{

	public static void main(String[] args) 
	{

		ArrayList<Integer> v=new ArrayList<>(); 
		
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		//Enumeration<Integer> ele=v.elements();  //Enumeration can only read data
		
		Iterator<Integer> ele=v.iterator();
		
		while(ele.hasNext())
		{
			Integer val=ele.next();  //iterator
			if(val%2==0)
			{
				System.out.println(val);
			}
			else
			{
				ele.remove();
			}
			
		}
		
		System.out.println(v);
	}

}
