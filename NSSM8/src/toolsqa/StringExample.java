package toolsqa;

public class StringExample {

	public static void main(String[] args) {
		
		//StringBuffer str=new StringBuffer("My name is santosh");
		String s="my name is santosh";
		char[] ch=s.toCharArray();
		System.out.println(ch.length);
		int count=0;
		System.out.println("Duplicate characters are :");
		for(int i=0; i<=s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}

	}

}
