package p1;

import java.util.Scanner;

public class CountWords {
	
	String str;
	int i;
	public  void calculate()
	{
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		i=0;
		if(str.charAt(0)!=' ')
		{
			i++;
		}
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)==' ')
			{
				i++;
			}
		}
		System.out.println("string is "+str);
		System.out.println("no of words "+i);
	}
	public static void main(String[] args) {
		CountWords cw=new CountWords();
		cw.calculate();
	}

}
