package package1;

import java.util.Scanner;

public class Example {
	
	int id;
	String name;
	String designation;
	
	Example(int id,String name,String designation)
	{
		this.id=id;
		//this.name=name;
		this.designation=designation;
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id:");
		int enteredID=scn.nextInt();
		System.out.println("Enter Name:");
		String enteredName=scn.nextLine();
		
		 
		Example exp= new Example(25,"santosh","Aut. Test engg.");
		System.out.println(exp.id);
		System.out.println(exp.designation);
		//System.out.println(exp.id);
	}

}
