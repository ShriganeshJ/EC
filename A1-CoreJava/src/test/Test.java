package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		
		String str="gaanness";
		
		char ch [] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
			
			else
			{
				map.put(ch[i],1);
			}
			
			
		}
		
		
		map.forEach((k,v)->System.out.println("key"+k+"value"+v));
		
		
		
		
		
		
	}

}
