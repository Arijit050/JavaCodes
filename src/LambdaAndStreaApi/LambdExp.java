package LambdaAndStreaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface OneInterface {
	int calculate(int a, int b);
}

public class LambdExp {

	public static void main(String[] args) {
		
		List<Integer> value = new ArrayList<Integer>(Arrays.asList(10,11,12,13,14));
		
		List flow = value.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(flow);
		
	OneInterface one = ((a,b)-> {System.out.println("Addition"); return a+b;});
	
	
	
	System.out.println(one.calculate(10,20));
				                     
				                     
		

	}

}
