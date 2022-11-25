package mq.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface_TreeSet {

	public static void main(String[] args) {
		
		/*
		 * Set is a unorder collection of objects. And Set
		 * doesn't allow duplicates
		 */
		
		
		Set<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add("six");
		
		
		//Remove Object Using name
		set.remove("four");
		
		
		//Get Size of collection
		int Count=set.size();
		System.out.println("Collection Count is ---> "+Count);
		
		
		//Verify Required object contains in Collection
		boolean flag=set.contains("four");
		System.out.println("Object available status is ---> "+flag);
		
		
		//Get First iterator value
		String FirstObject=set.iterator().next();
		System.out.println("First Iterator object is ---> "+FirstObject);
		
		//Clear all objects from collection
		//set.clear();
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Empty status ---> "+flag1);
		
		
		
		//Read all object from collection using foreach loop
		for (String eachobj : set) 
		{
			System.out.println(eachobj);
		}
		
		
		//Covert Collections into iterators
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			String iterator=itr.next();
			System.out.println(iterator);
		}
		

	}

}
