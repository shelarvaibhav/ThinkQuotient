import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many term you want");
		int num = sc.nextInt();
//		int i = 1;
//	    while(i<=num)
//	    {
//	    	System.out.print(i*i+" ");
//	    	i++;
//	    }
		for(int i = 1;i<=num;i++)
		{
			System.out.print(i*i+" ");
		}

	}

}