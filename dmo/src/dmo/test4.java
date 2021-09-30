package dmo;

public class test4 {
	
	
	
	
	
	
	public static void main(String[] args) {
		String str[] = {"co","dill","Ity"};
		
		solution(str);
		
	}
	
	
	
	
	
	public static  int solution(String[] A) {
        // write your code in Java SE 8
		
		
		String str1 ="";
		       
		
		for(int i=0;i<A.length;i++)
		{
			//System.out.println(A[i]);
			str1=str1+A[i];
			
		}
		
		
		System.out.println(str1);
		return str1.length();
    }
	
	

	

}
