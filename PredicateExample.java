package functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubica
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string,prefix) -> string.startsWith(prefix);
		
		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));
		
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		
		Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
		
		
		Predicate<String> brownEggs2 = egg.and(brown);
		Predicate<String> otherEggs2 = egg.and(brown.negate());

	}

}
