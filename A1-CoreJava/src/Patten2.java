
public class Patten2 {
	
	
	public static void main(String[] args) {
		
		
		//duplicate element
		
		Integer array[] = {10,20,30,40,10,20,30,90,10,20,30};
		
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		}
		
		
	
		
		
		
		
	}

}
