package functionalProgramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample1 {
	
	static Supplier<LocalDate> s1 = LocalDate::now;
	static Supplier<LocalDate> s2 = () -> LocalDate.now();
	
	static LocalDate d1 = s1.get();
	static LocalDate d2 = s2.get();
	
	static Supplier<StringBuilder> sb1 = StringBuilder::new;
	static Supplier<StringBuilder> sb2 = () -> new StringBuilder();

	static Supplier<ArrayList<String>> as1 = ArrayList::new;
	static ArrayList<String> a1 = as1.get();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(sb1.get() + " " + sb2.get());
		
		System.out.println(a1);
		System.out.println(as1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(sb1);
		System.out.println(sb2);

	}

}
