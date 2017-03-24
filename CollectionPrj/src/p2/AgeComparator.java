package p2;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class AgeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Student s1=(Student)obj1;
		Student s2=(Student)obj2;
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else 
			return -1;
	}

}


