package Learncollection;
import java.util.ArrayList;

public class ListExample2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(69);
		list.add(56);
		list.add(78);
		list.add(19);
		
		System.out.println(list);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		System.out.println(list.size());
		System.out.println("----------------------------");
		list.remove(3);
		System.out.println(list);
		
		
		list.remove(list.size()-1);
		System.out.println(list);
		System.out.println("-----------------------");
		
		
		ArrayList<Integer> list2=
				new ArrayList<Integer>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
		
		list.addAll(list2);
		System.out.println(list);
		
		list.removeAll(list2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		
	}

}
