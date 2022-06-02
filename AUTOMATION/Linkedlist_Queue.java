import java.util.*;
public class Linkedlist_Queue {

	public static void main(String[] args) {
		
        Queue q = new LinkedList(); 
        q.add(10);
        q.add(25);
        q.add(1);
        System.out.println(q);
        q.offer("vaibhav");
        System.out.println(q);
        q.poll();
        System.out.println(q);
	}

}