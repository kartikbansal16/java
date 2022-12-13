public class Q1
{
	public static void main(String[] args) {
		String s = "Hello World";
		//char c = 'l';
		int count = 0;
		
		int s1 = s.length();
		s= s.replace("l","");
		int s2 = s.length();
		
		count = s1-s2;
		
		System.out.println(count);
	}
}
