package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>(9);
		a1.add("1000");
		a1.add("s1");
		a1.add("s2");
		a1.add("250");
		a1.add(2,"s3");
		//a1.remove(3);
		/*a1.add(4,"s3");
		a1.add("s2");
		a1.add("s5");
		a1.add("s6");*/
		/*System.out.println("displaying items using enhanced for loop");
		for(Object ob : a1)
		{
			System.out.println(ob);
		}*/
		System.out.println("Displaying items using iterator");
		System.out.println("Size "+a1.size());
		Iterator<String> it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}















