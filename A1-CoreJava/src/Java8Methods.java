import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Methods {
	
	
	public static List<Employee> getEmployee()
	{
		List<Employee> list = Arrays.asList(new Employee(5, "raj", 20, "hyd", 25000),
				new Employee(10, "mahes", 27, "pun", 75000),
				new Employee(6, "statish", 32, "del", 85000),
				new Employee(9, "ravi", 29, "kel", 95000));
		
		
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		List<Employee> list = getEmployee();
		
		
		
		
		//get min max sal of employeee
		
		int min=list.stream().map(i->i.getSal()).min((x,y)->x.compareTo(y)).get();	
		int max = list.stream().map(i->i.getSal()).max((x,y)->x.compareTo(y)).get();
		
		System.out.println(min);
		System.out.println(max);
		
		
		
		//sort 
	List<String> stringList =	  list.stream().map(i->i.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	List<String> stringList02 =	  list.stream().map(i->i.getName()).sorted().collect(Collectors.toList());
	System.out.println(stringList);
	System.out.println(stringList02);
		
		
	}
	
	
	
	
	

}
