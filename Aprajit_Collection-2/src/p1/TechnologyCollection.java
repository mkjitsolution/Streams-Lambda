package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Ashish's Product
public class TechnologyCollection<T> implements Iterator<T>
{

	List<T> list = new ArrayList<>();
	int index = 0;
	
	public TechnologyCollection(List<T> list) {
		super();
		this.list = list; // 3
	}

	@Override   // yes / no 
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < list.size();
	}

	@Override   // return data at index position
	public T next() {
		T data = list.get(index);
		index+=2;
		return data;
	}
	
	
}
