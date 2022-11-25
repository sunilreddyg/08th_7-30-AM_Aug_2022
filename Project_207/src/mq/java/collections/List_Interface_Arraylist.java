package mq.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List_Interface_Arraylist 
{

	public static void main(String[] args) 
	{
		/*
		 * List store group of object inorder. And allow
		 * duplicate values.
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("two");
		list.add("four");
		list.add("five");
		list.add("six");
		
		
		//Get single obejct from collection using index number
		String IndexObj=list.get(2);
		System.out.println("2nd index object is ---> "+IndexObj);
		
		//Remove Object Using name
		list.remove("four");
		
		
		//Get Size of collection
		int Count=list.size();
		System.out.println("Collection Count is ---> "+Count);
		
		
		//Verify Required object contains in Collection
		boolean flag=list.contains("four");
		System.out.println("Object available status is ---> "+flag);
		
		
		//Get First iterator value
		String FirstObject=list.iterator().next();
		System.out.println("First Iterator object is ---> "+FirstObject);
		
		//Clear all objects from collection
		//list.clear();
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Empty status ---> "+flag1);
		
		
		//Reading all collection objects using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String RuntimeObj=list.get(i);
			System.out.println(RuntimeObj);
		}
		
		
		
		//Read all object from collection using foreach loop
		for (String eachobj : list) 
		{
			System.out.println(eachobj);
		}
		
		
		//Covert Collections into iterators
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			String iterator=itr.next();
			System.out.println(iterator);
		}
		
	}

}
