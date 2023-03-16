package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Optional<Integer> min = list.stream().min((val1,val2)->{
								return val1.compareTo(val2);
								});
		System.out.println(min.get());
		
		Optional<Integer> max = list.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
	}
}
