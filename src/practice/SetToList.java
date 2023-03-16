package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	
		
		

	}

}
