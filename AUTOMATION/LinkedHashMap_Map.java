public class LinkedHashMap_Map {
	
	public static void main(String[] args) {
		
		Map m = new LinkedHashMap();
		m.put(1,"vaibhav");
		m.put(8, 34);
		m.put("akash",65);
		System.out.println(m);
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry map = (Map.Entry)itr.next();
			System.out.println("Key : "+map.getKey()+"<-->"+"Value : "+map.getValue());
			//Object obj = itr.next();
			//System.out.println(obj);
		}
	}
}