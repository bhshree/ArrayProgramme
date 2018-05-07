package arrayProgramme;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestEnumeration {

	public static void main(String[] args)
	{

		LinkedList<String> l1=new LinkedList<>();
		
		l1.add("Ravi");  //We printed collection values
		l1.add("Bhagyashree");
		l1.add("Mohan");
		

		System.out.println(l1);

		//ListIterator<String> litr=new ListIterator<>();
		ListIterator<String> litr=l1.listIterator();
		
		while(litr.hasNext())
		{
			String s=litr.next(); //iterator
			if(s.equals("Mohan"))
				litr.set("Rajesh");
			{
				System.out.println(s);
			}
			
			
		}
		
		System.out.println(l1);
	
		// TODO Auto-generated method stub

	}

}
