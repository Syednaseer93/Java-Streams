package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckListSorted {

	public static void main(String[] args) {
		List<Integer> orgList = Arrays.asList(30,20,10,60,90,40);
		List<Integer> sortedList = orgList.stream().sorted().collect(Collectors.toList());

		List<Integer> revsortedList = orgList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	/*	if(orgList.equals(sortedList)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}*/
		System.out.println(revsortedList);

		System.out.println(sortedList);
	}

}
