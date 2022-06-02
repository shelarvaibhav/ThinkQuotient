import java.util.*;
public class LinkedHashSet_Set {

	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		s.add("vaibhav");
		s.add(20);
		s.add(60.00);
		s.add(null);
	    System.out.println(s);
	    Iterator itr = s.iterator();
	    while(itr.hasNext())
	    {
	    	Object obj = itr.next();
	    	System.out.println(obj);
	    }
	}

}