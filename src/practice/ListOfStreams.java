package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStreams {
	String name;
	int age;
	char grade;


	public ListOfStreams(String name, int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

public static void main(String[] args) {

	List<ListOfStreams>list1=new ArrayList<>();
	list1.add(new ListOfStreams("John",26,'A'));
	list1.add(new ListOfStreams("Luke",19,'C'));
	list1.add(new ListOfStreams("Smith",35,'B'));
	

	List<ListOfStreams>list2=new ArrayList<>();
	list2.add(new ListOfStreams("Joe",21,'B'));
	list2.add(new ListOfStreams("Curren",38,'A'));
	list2.add(new ListOfStreams("Mike",18,'D'));
	
	List<List<ListOfStreams>> list = Arrays.asList(list1,list2);
	List<Integer> listt = list.stream().flatMap(s->s.stream().filter(n->n.age<20).map(n->n.age)).collect(Collectors.toList());
	System.out.println(listt);
	
	}
													 	
	

	





	}


