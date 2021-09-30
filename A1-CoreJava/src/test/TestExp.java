package test;

import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestExp  {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		
		List<Integer> lisst = list.stream().filter((i)->i%2==0).collect(Collectors.toList());
		
		System.out.println(lisst);
		
	}
	
	
	
	
	public void abc() throws Exception
	{
		
	}
	
	
	

}


class wxdy extends TestExp
{
	@Override
	public void abc() throws IllegalAccessError
	{
		
	}
}


