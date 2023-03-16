package practice;

import java.util.HashSet;
import java.util.Set;

public class MatchStreams {

	public static void main(String[] args) {
		Set<String>set=new HashSet<>();
		set.add("One Apple");
		set.add("One Banana");
		set.add("Three Guava");
		set.add("Two Orange");
		set.add("Four Pineapple");
		
		boolean result = set.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println(result);
		
		boolean result2 = set.stream().allMatch(value -> {return value.startsWith("Three");});
		System.out.println(result2);
		
		boolean result3 = set.stream().noneMatch(value-> {return value.startsWith("three");});
		System.out.println(result3);
	}

}
