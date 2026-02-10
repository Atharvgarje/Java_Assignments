package assignment.week2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Problem9 {
	
	public static void main(String[] args) {
		
		System.out.println("USing hashmap");
		HashMap<Integer, String> emp=new HashMap<Integer, String>();
		emp.put(1, "Atharv");
		
		emp.put(8, "Garje");
		
		emp.put(5, "Aksay");
		
		emp.put(8, "Akshay");
		
		emp.put(22, "Raj");
		
		System.out.println(emp);
		System.out.println();
		
		System.out.println("Using LinkedHashMap: ");
		LinkedHashMap<Integer, String> emp1= new LinkedHashMap<Integer, String>();
		
		emp1.put(1, "Atharv");
		
		emp1.put(8, "Garje");
		
		emp1.put(5, "Aksay");
		
		emp1.put(8, "Akshay");
		
		emp1.put(22, "Raj");
		
		System.out.println(emp1);
		System.out.println();
		
		System.out.println("Using TreeMap");
		
		TreeMap<Integer, String> emp2=new TreeMap<Integer, String>();
		
		emp2.put(1, "Atharv");
		
		emp2.put(8, "Garje");
		
		emp2.put(5, "Aksay");
		
		emp2.put(8, "Akshay");
		
		emp2.put(22, "Raj");
		
		System.out.println(emp2);
	}
}
