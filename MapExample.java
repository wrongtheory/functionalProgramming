package functionalProgramming;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus");
		//favorites.put("Jenny", "Tram");
		favorites.put("Tom", null);
		
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites);
		
	}

}
