package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("R","E","E","S","A","N");
		Optional<String> combinedList = list.stream().reduce((value,combinedValue)->{
												return combinedValue+value;
	});
		System.out.println(combinedList.get());
		
   List<Integer> numlist = Arrays.asList(50,10,30,90,40);
   Optional<Integer> numlist2 = numlist.stream().max((val1,val2)-> { return val1.compareTo(val2);});
   System.out.println(numlist2.get());
	}

}
