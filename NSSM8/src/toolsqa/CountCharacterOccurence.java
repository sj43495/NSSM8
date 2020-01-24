package toolsqa;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String s = "Java is java again java again";
		char c='a';
		System.out.println(s.replace("a", ""));
		int count=s.length()-s.replace("a", "").length();
		System.out.println("Number of occurance of 'a' in "+s+" = "+count);
	}

}
