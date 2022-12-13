public class Q3 {
    //reverse a string and remove char from 4 to 9 index, from the reverse striing using string buffer
public static void main(String[] args) {
	    String s = "CHIMPANZE IS BLACK";
	    StringBuffer st = new StringBuffer(s);
	    st.reverse();
	    
	    System.out.println(st);
	    
	    
	    
	    st.delete(4,9);
	   
	   System.out.println(st);
	   
	    
	}
}
