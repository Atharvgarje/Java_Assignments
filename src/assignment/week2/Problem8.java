package assignment.week2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable
{
	public String username;
	public transient String password;
	public String email;
}

public class Problem8 {

	public static void main(String[] args) {
		User u=new User();
		try
		{
			u.username="Atharv";
			u.email="atharv@gmail.com";
			u.password="12345";
			User desUser;
			FileOutputStream fout=new FileOutputStream("src/doc/storeObject.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(u);
			out.close();
			fout.close();
			System.out.println("Object serialized");
			
			FileInputStream fIn=new FileInputStream("src/doc/storeObject.txt");
			ObjectInputStream in=new ObjectInputStream(fIn);
			
			desUser=(User)in.readObject();
			in.close();
			fIn.close();
			
			System.out.println();
			System.out.println("deserialized Username: "+desUser.username);
			System.out.println("deserialized email id: "+desUser.email);
			System.out.println("deserialized password: "+desUser.password);
			
		}catch(IOException i)
		{
			i.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
