package functionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	
	static Consumer<String> c1 = System.out::println;
	static Consumer<String> c2 = (String x) -> System.out.println(x);
	
	static Map<String, Integer> map = new HashMap<>();
	static BiConsumer<String, Integer> b1 = map::put;
	static BiConsumer<String, Integer> b2 = (k,v) -> map.put(k, v);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1.accept("Annie");
		c2.accept("Bennie");
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		
		System.out.println(map);
		System.out.println("update");
		System.out.println("update2");
		System.out.println("update 3");
		System.out.println("update4");
	}

}
