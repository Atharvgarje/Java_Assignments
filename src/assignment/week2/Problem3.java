package assignment.week2;

abstract class Employee{
	
	String name;
	int empId;
	
	public Employee(String name, int empId) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.empId=empId;
	}
	abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
	}
	
}

class FullTimeEmployee extends Employee{
	String name;
	int empId;
	double salary;
	
	public FullTimeEmployee(String name,int empId,double salary ) {
		// TODO Auto-generated constructor stub
		super(name,empId);
		this.salary=salary;
		
	}
	@Override
	double calculateSalary()
	{
		return salary;
	}
}

class PartTimeEmployee extends Employee{
	String name;
	int empId;
	double salary;
	public PartTimeEmployee(String name,int empId,double salary) {
		// TODO Auto-generated constructor stub
		super(name,empId);
		this.salary=salary;
	}
	
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
}

public class Problem3 {
	
	public static void main(String[] args) {
		Employee e1=new FullTimeEmployee("atharv",1, 11000);
		Employee e2=new PartTimeEmployee("garje", 2, 12000);
		
		e1.displayDetails();
		System.out.println(e1.calculateSalary());
		
		e2.displayDetails();
		System.out.println(e2.calculateSalary());
	}

}
