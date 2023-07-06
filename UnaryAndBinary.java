package functionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		System.out.println(u1.apply("hello"));
		System.out.println(u2.apply("java"));
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string,toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("hello ", "Java"));
		System.out.println(b2.apply("java ", "rulezzz"));

	}

}
