
public class Patten01 {
	
	
	public static void main(String[] args) {
		//(0,6)
		//(1,5)
		//(2,4)
		//(3,3)
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		for(int i=0;i<=3;i++)
		{
			
			sb.append(i);
			
			
		}
		for(int i=6;i>=3;i--)
		{
			
			sb1.append(i);
			
		}
		
		
		
		for(int k=0;k<sb.length();k++)
		{
			System.out.println(sb.charAt(k)+","+sb1.charAt(k));
		}
		
		
		
	
		
		
		
		
	}

}
