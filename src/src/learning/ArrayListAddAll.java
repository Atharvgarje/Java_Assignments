package src.learning;

import java.util.*;  
public class ArrayListAddAll{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ravi");  
  al2.add("Hanumat");  
  al.addAll(al2);//adding second list in first list  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  al.removeAll(al2);//removing second list in first list  
  Iterator itr1=al.iterator();  
  while(itr1.hasNext()){  
   System.out.println(itr1.next());  
  }  
 }  
}