package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainCls {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList a1=new ArrayList();
		a1.add(new Student(10,"s1",23));
		a1.add(new Student(12,"S2",24));
		a1.add(new Student(20,"s1",22));
		System.out.println("Sorting by name");
		
		Collections.sort(a1,new NameComparator());
		
		@SuppressWarnings("rawtypes")
		Iterator it= a1.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();
			System.out.println("Id "+s.rollno+" Name "+s.name+" Age "+s.age);
		}
		
		System.out.println("Sorting by Age ");
		Collections.sort(a1,new AgeComparator());
		@SuppressWarnings("rawtypes")
		Iterator it1=a1.iterator();
		while(it1.hasNext())
		{
			Student s=(Student)it1.next();
			System.out.println("Id "+s.rollno+" Name "+s.name+" Age "+s.age);
		}
	}

}
