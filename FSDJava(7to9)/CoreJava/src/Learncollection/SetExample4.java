package Learncollection;

import java.util.TreeSet;

public class SetExample4 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>((o1,o2)->o2-o1);
		treeSet.add(20);
		treeSet.add(90);
		treeSet.add(20);
		treeSet.add(1);
		treeSet.add(5);
		
		System.out.println(treeSet);
		
		
	}

}
