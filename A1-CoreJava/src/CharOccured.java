import java.util.HashMap;
import java.util.Map;

public class CharOccured {

	//

	static String acbd = "ganeshamaheshadinesa";
	static Map<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
      
		char chararry[] = acbd.toCharArray();

		for (int i = 0; i < chararry.length; i++) {
			
			
			
			
			if(map.containsKey(chararry[i]))
			{
				map.put(chararry[i], map.get(chararry[i])+1);
			}
			else
			{
				map.put(chararry[i], 1);
			}
			
			

		}
		
		
		
	map.forEach((k,v)->System.out.println(k +"--->"+v));
		
		
		
		

	}

}
