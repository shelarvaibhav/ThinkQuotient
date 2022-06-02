import java.util.*;

public class ConvertArraylListToArray {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList();
		
		lst.add("vaibhav");
		lst.add("Omkar");
		lst.add("akash");
		lst.add("Rushikesh");
		
		System.out.println(lst);
		String array1[] = lst.toArray(new String[0]);
		 
		 for(String str : array1)
		 {
			 System.out.println(str);
		 }
	}

}