public class SumOf1To10 {

	public static void main(String[] args) {

     int sum = 0,num = 1 ;
     
     do
     {
    	 sum = sum + num;
    	 num++;
     }while(num <= 10);
     System.out.println("Sum of 1st 10 num = "+sum);

	}

}