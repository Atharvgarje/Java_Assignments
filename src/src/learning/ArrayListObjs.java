package src.learning;

import java.util.*;

class Student
{
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
}
public class ArrayListObjs {

	public static void main(String[] args) {
		ArrayList<Student>al = new ArrayList<Student>();
		
			
			al.add(new Student(101,"Ravi",23));
			al.add(new Student(102,"chand",24));
			
			 Iterator<Student> itr=al.iterator();
			 while(itr.hasNext()) {
				 Student st=(Student)itr.next();
				 System.out.println(st.rollno+" "+st.name+" "+st.age);
			 }
			
		
	}
}
