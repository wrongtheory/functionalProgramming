package functionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> mapper = 
				(v1,v2) -> v1.length() > v2.length()?
						v1:v2;
			
		Map<String, String> fav = new HashMap<>();
		fav.put("Sam", null);
		fav.put("Jenny", "Bus tour");
		fav.put("Tom", "Tram");
		
		String jenny = fav.merge("Jenny", "Skyride", mapper);
		String tom = fav.merge("Tom", "Skyride", mapper);
		
		System.out.println(fav);
		
		System.out.println(jenny);
		System.out.println(tom);
		
		fav.merge("Tom", "Skyride", mapper);
		fav.merge("Sam", "Skyride", mapper);
		
		System.out.println(fav);
		
		BiFunction<String, String, String> mapper2 = 
				(v1,v2) -> null;
				
		Map<String, String> fav2 = new HashMap<>();
		fav2.put("Jenny", "bus tour");
		fav2.put("Tom", "bus tour");
		
		fav2.merge("Jenny", "Skyride", mapper2);
		fav2.merge("Sam", "Skyride", mapper2);
		
		System.out.println(fav2);

	}

}
