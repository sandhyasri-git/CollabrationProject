package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDetails implements Comparable<StudentDetails> {

	private int rollno;
	private String name;
	private int age;
	@Override
	public int compareTo(StudentDetails obj) {
		StudentDetails sd=(StudentDetails)obj;
		if(this.age==sd.age)
			return 0;
		else if(this.age>sd.age)
			return 1;
		else
			return -1;
		
	}
	public StudentDetails(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public static void main(String a[])
	{
		ArrayList<StudentDetails>a1=new ArrayList<StudentDetails>();
		a1.add(new StudentDetails(21,"s1",25));
		a1.add(new StudentDetails(22,"s2",23));
		a1.add(new StudentDetails(23,"s3",19));
		Collections.sort(a1);
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			StudentDetails s=(StudentDetails)it.next();
			System.out.println("Id "+s.rollno+" Name "+s.name+" Age "+s.age);
		}
			
		
	}
}
