import java.util.*;
public class HashSet_Set {

	public static void main(String[] args) {
		
		Set <String> str = new HashSet<String>();
		str.add("vaibhav");
		str.add("Akash");
		str.add("vaibhav");
		str.add("kiran");
		System.out.println(str);
		Iterator itr = str.iterator();
		while(itr.hasNext())
		{
			Object obj  = itr.next();
			System.out.println(obj);
		}
	}

}