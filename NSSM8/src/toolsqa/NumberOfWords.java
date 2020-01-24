package toolsqa;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] words=s.trim().split("\\s");
		for(String s1:words)
		{
		System.out.println(s1);
		}
		System.out.println("Number of words in the String : "+words.length);
	}

}
