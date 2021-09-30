package dmo;

public class test {
     public static int pres=0;
     
     
     
     public String solution(String S) {
         // write your code in Java SE 8
    	 
    	 char [] ch =S.toCharArray();
    	 
    	
    	 StringBuffer sb = new StringBuffer();
    	 
    	 int maxc=0;
    	 
    	 for(int i=0;i<ch.length;i++)
    	 {
    		 
    		 int curVal = ch[i];
    		 
    		 if(curVal>maxc)
    		 {
    			 maxc=ch[i];
    		 }
    		 
    		 
    		 
    		
    		 
    	 }
    	 
    	 
    	 
    	 String st = Character.toString((char)maxc);
    	 
    	S=S.replace(st,"");
    	 
    	 
    	 
    	 
    	 
    	 
    	 return S;
    	 
     }
     
     
     
     
     
     
     
	public static void main(String[] args) {
		
		
		test t = new test();
	String s=	t.solution("abc");
	System.out.println("Output "+s);
		
		

	}
	
	
	
	
}
