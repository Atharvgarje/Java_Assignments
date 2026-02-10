package assignment.week2;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList(
                "Amit",
                "Rahul",
                "Anjali",
                "Sneha",
                "Akash",
                "Vijay"
        );

        System.out.println("All Employee Names:");
        employees.forEach(name -> System.out.println(name));

        System.out.println("Names starting with 'A':");
        employees.stream()
                 .filter(name -> name.startsWith("A"))
                 .forEach(name -> System.out.println(name));

        System.out.println("Names sorted alphabetically:");
        employees.stream()
                 .sorted()
                 .forEach(name -> System.out.println(name));
    }
}
