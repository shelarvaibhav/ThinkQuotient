import java.util.*;
public class NumberInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number between 1 to 10");
		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1: System.out.println("One");
		         break;
		 case 2: System.out.println("Two");
                 break;
		 case 3: System.out.println("Three");
                 break;
		 case 4: System.out.println("Four");
                 break;
		 case 5: System.out.println("Five");
                 break;
		 case 6: System.out.println("Six");
                 break;
		 case 7: System.out.println("Seven");
                 break;
		 case 8: System.out.println("Eight");
                 break;
		 case 9: System.out.println("Nine");
                 break;
	     case 10: System.out.println("Ten");
                  break;
         
		}
	}

}
