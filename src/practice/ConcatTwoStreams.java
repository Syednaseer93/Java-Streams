package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Monkey", "Lion", "Peacock");
		List<String> list2 = Arrays.asList("Tiger", "Snake", "Rabbit");
		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();
		List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
		for (String s : list) {
			System.out.println(s);
		}
	}
}
