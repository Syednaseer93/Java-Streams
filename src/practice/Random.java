package practice;

import java.util.Arrays;
import java.util.List;

public class Random {

	public static void main(String[] args) {
		List<Integer> unsortedList = Arrays.asList(40,20,10,70,30,86);
		unsortedList.stream().sorted().map(s->s.intValue()).forEach(w->System.out.println(w));
	
	}
}
