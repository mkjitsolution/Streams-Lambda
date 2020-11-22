package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


// Question 
/*
 * 1. remove elements from list while iteration
 * 2. reverse iteration
 * */
public class DemoApp {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java-se");
		list.add("java-ee");
		list.add("node.js");
		list.add("react.js");
		list.add("python.py");
		
		
		
		
		
	
		
	}//end main
	
	public void displayList(Collection<String> list)
	{
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String data = itr.next();
			if(data.endsWith("js"))
			{
				list.remove(data);
			}
			System.out.println(data);// 
		}
	}
	
}//end Class
