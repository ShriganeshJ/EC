package dmo;

public class test2 {
     public static int pres=0;
     
     
     
    
   
    	    public int solution(int N) {
    	        // write your code in Java SE 8
    	    	String number="5";
    	    	
    	    	String mve="";
    	    	Number num = N;
    	    	if(N<=0)
    	    	{
    	    	mve=num.toString();
    	    	
    	    	number=number.concat(mve);
    	    	
    	    	}
    	    	
    	    	System.out.println(number);
    	    	
    	    	return 0;
    	    	
    	    	
    	    	
    	    	
    	    	
    	    }
     
     
     
     
     
	
public static void main(String[] args) {
	
	test2 t = new test2();
	t.solution(-10);
}
     
}
