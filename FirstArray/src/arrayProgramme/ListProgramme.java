package arrayProgramme;

import java.awt.List;
import java.util.ArrayList;

public class ListProgramme {

	public static void main(String[] args)
	{
		ArrayList<Object> a=new ArrayList();
		
		a.add(10);  //We printed collection values
		a.add("Bhagyashree");
		a.add(10.3f);
		a.add(10);
		a.add(20);
		a.add(30);

		System.out.println(a);
		
		System.out.println(a.get(1)); //It will print position data
		System.out.println("Is it present"+a.contains("10"));
		System.out.println("Index of"+a.indexOf(20));
	}

}
