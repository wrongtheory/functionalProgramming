package functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f1 = String::length;
		
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("cluck"));
		
		System.out.println(f2.apply("hi"));
		
		BiFunction<String, String, String> b1 = 
				String::concat;
		BiFunction<String, String, String> b2 = 
				(string, toAdd) -> string.concat(toAdd);
				
		System.out.println(b1.apply("Hello", " Victor"));
		
		System.out.println(b2.apply("1 ", "2"));
		
		BiFunction<String, String, Integer> b3
		= String::indexOf;
		
		System.out.println(b3.apply("Hello", "o"));

	}

}
