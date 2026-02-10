package src.learning;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		System.out.println("Using iterator : ");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using for each: ");
		for(String obj:list)
		{
			System.out.println(obj);
		}
	}

}
