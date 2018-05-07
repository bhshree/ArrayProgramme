package arrayProgramme;


import java.util.LinkedList;



public class ListIterator {

	public static void main(String[] args)
	{

		LinkedList<String> l1=new LinkedList<>();
		
		l1.add("Ravi");  //We printed collection values
		l1.add("Bhagyashree");
		l1.add("Mohan");
		

		System.out.println(l1);

		ListIterator litr=new ListIterator();
		
		while(litr.hasNext())
		{
			String s=litr.next();  //iterator
			if(s.equals("Mohan"))
			{
				System.out.println(s);
			}
			else
			{
				litr.remove();
			}
			
		}
		
		System.out.println(litr);
	
		// TODO Auto-generated method stub

	}

	private String next() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

}
