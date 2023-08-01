package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Conditionally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list);
		
		//Predicate<String> p1 = String::startsWith;
		BiPredicate<String, String> b1 = String::startsWith;
		
		list.removeIf(s -> s.startsWith("A"));
		
		//list.removeIf(b1);
		
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(123,221,321);
		//list2.replaceAll(x -> x*2);
		System.out.println(list2);
		//list2.replaceAll(Integer::max);
		System.out.println(list2);
		
		//System.out.println(Integer.reverse(123));
		
		List<String> cats = Arrays.asList("Annie", "Ripley");
		for(String cat : cats)
			System.out.println(cat);
		
		cats.forEach(System.out::println);

	}

}
