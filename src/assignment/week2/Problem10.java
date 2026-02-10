package assignment.week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	
	public int id;
	public String name;
	public int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+marks+" "+name;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	
}

class SortByName implements Comparator<Student> 
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

public class Problem10{
	
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"Atharv",100));
		list.add(new Student(2,"Aditya",90));
		list.add(new Student(3,"Ashish",80));
		
		Collections.sort(list);
		System.out.println("Sorted by Marks:");
        for (Student s : list) {
            System.out.println(s);
        }
        
        Collections.sort(list, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : list) {
            System.out.println(s);
        }
		
		
	}
	
}