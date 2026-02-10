package src.learning;

class Students
{
	String name;
	int marks;
	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	static Students passedStudent(String name,int marks) {
		return new Students(name, marks);
	}
	static Students failedStudent(String name,int marks) {
		return new Students(name,marks);
	}
	static Students nameOnly(String name) {
		return new Students(name,0);
	}
	
	void display()
	{
		System.out.println("name : "+name);
		System.out.println("marks: "+marks);
	}
	
}

public class StaticObject {

	public static void main(String[] args) {
		Students s1=Students.passedStudent("Atharv", 85);
		Students s2=Students.failedStudent("Rahul", 35);
		Students s3=Students.nameOnly("Amit");
		s1.display();
		s2.display();
		s3.display();
	}
}
