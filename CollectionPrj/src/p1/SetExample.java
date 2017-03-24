package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExample {
	

	public static void main(String[] args) {
		HashSet t1=new HashSet();
		t1.add("BBB");
		t1.add("AAA");
		t1.add("aaa");
		t1.add("CCC");
		t1.add("BBB");
		System.out.println("Size "+t1.size());
		Iterator it=t1.iterator();
		while(it.hasNext())
		{
			System.out.println("Items "+it.next());
		}

	}

}
