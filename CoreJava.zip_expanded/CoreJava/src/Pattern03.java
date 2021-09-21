import java.util.Arrays;
import java.util.Comparator;

public class Pattern03 {
	
	
	
	public static void main(String[] args) {
		
	
	
	String str [] = {"ram","raja","ranisssl","ganesh"};
	
	
	
	
	
	String longeven=Arrays.stream(str).filter(i->i.length()%2==0).max(Comparator.comparingInt(String::length)).orElse("");
	
	System.out.println(longeven);
	
	
	}
	
	
}
