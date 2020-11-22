package p1;

import java.util.ArrayList;
import java.util.List;

public class TechListMainClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java-se");
		list.add("java-ee");
		list.add("node.js");
		list.add("react.js");
		list.add("python.py");
		
		// custom collection --> created
		TechnologyCollection<String> techlist = new TechnologyCollection<>(list);
		
		while(techlist.hasNext())
		{
			System.out.println(techlist.next());
		}
		
		
	}
}
