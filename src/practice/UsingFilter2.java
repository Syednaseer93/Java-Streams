package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFilter2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aaa", "Ccccc", "Eee", "Bbb", "Ddd");
		// List<String> list2 =
		// list.stream().filter(s->s.length()>4).collect(Collectors.toList());
		List<String> list3 = list.stream().filter(s -> s.startsWith("A") || s.startsWith("B"))
				.collect(Collectors.toList());
		System.out.println(list3);
	}
}
