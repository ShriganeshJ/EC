
public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(checkNumber(7));
		
		
		
	}
	
	
	public static int checkNumber(int number)
	{
		int flag =0;
	
		
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
			flag=flag+1;
			
			System.out.println("devided by i"+i);
			}
			
			
			
		}
		
		return flag;
	}

}
