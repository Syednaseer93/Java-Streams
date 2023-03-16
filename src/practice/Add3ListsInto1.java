package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Add3ListsInto1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20);
		List<Integer> list2 = Arrays.asList(30,40);
		List<Integer> list3 = Arrays.asList(50,60);
		List<List<Integer>>finalList=Arrays.asList(list1,list2,list3);
		
		List<Integer> combinedList = finalList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(combinedList);
	}

}
