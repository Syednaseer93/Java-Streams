package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFilter {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,20,35,40,50);
		List<Integer>evenNumbers=new ArrayList<Integer>();
		List<Integer>oddNumbers=new ArrayList<Integer>();
		//ArrayList<Integer> evenNumbers=new ArrayList<>();
		evenNumbers=list.stream().filter(s->!(s%2==0)).collect(Collectors.toList());
		oddNumbers=list.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
	}
}
