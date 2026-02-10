package src.learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmpSerialization implements Serializable {
	
	public String emp_name;
	public String emp_addr;
	public int emp_Id;
	
	
	
	public static void main(String[] args) {
		EmpSerialization emp=new EmpSerialization();
		
		emp.emp_Id=1;
		emp.emp_name="atharv";
		emp.emp_addr="Nashik";
		EmpSerialization desEmp;
		try {
			FileOutputStream fileOut=new FileOutputStream("src/doc/storeObject.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.println("Object serialized");
			
			FileInputStream fileIn=new FileInputStream("src/doc/storeObject.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			desEmp=(EmpSerialization)in.readObject();
			in.close();
			fileIn.close();
			
			
		}catch(IOException i)
		{
			i.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("class not found");
			e.printStackTrace();
			return;
		}
	}
	

}
