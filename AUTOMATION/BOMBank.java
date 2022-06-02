public class BOMBank {

	int loan,yr;
	float ir;
	
	public float homeLoan(int l,float r,int y)
	{
		float totalamt = l+(l * r * y )/100;
		return totalamt;
	}
	
    public static void main(String args[])
    {
    	BOMBank bom = new BOMBank();
    	float total = bom.homeLoan(100000,8.0f,5);
    	System.out.println("Amount to RBI bank with interest is : "+total);
    }
}