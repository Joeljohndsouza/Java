package Learncollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(11);
		set.add(11);
		set.add(15);
		
		System.out.println(set.size());
		System.out.println("===========");
		
		
		
		Iterator<Integer> iterator = set.iterator();
		
		
		while(iterator.hasNext())
			
		{
			System.out.println(iterator.next());
			
			System.out.println(set.isEmpty());
		}
	}

}
