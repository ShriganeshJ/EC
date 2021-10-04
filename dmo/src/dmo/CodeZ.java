package dmo;

import java.util.HashSet;
import java.util.Set;

public class CodeZ {
	
	public static void main(String[] args) {
		
		
		solution(new int [] {3,4,5,3,7});
		
	}
	
	
	
	public static int solution(String S) {
        // write your code in Java SE 8
		
		int res = 0;
		
		Set<Character> set = new HashSet<Character>();
		
		
		
		for(int i=0;i<S.length();i++)
		{
			
			
			
			
			
			
			
			
			if(!(S.charAt(i)>65 && S.charAt(i)<=90))
			{
				
				//small char 
				res=-1;
			}
			else
			{
				//big char
				set.add(S.charAt(i));
			}
			
			
		}
		
		
		
		
		
		
		
		return res;
    }
	
	

}
