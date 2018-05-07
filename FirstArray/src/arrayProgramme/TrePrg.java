package arrayProgramme;

import java.util.Comparator;
import java.util.TreeSet;

public class TrePrg {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<>(new compare());
		
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(50);
		
		System.out.println(ts);
	}

}
class compare implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer v1=(Integer)o1;
		Integer v2=(Integer)o2;
		return -v1.compareTo(v2);  //For ascending and descending put minus sign
	}
	
}