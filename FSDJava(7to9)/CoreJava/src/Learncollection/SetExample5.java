package Learncollection;

import java.util.TreeSet;

public class SetExample5 {
	public static void main(String[] args) { 
		
		
		TreeSet<Integer> treeSet= new TreeSet<Integer>();
		treeSet.add(19);
		treeSet.add(100);
		treeSet.add(65);
		treeSet.add(78);
		treeSet.add(65);
		treeSet.add(176);
		
		System.out.println(treeSet);
		System.out.println(treeSet.higher(10));
		System.out.println(treeSet.lower(1));
		
		System.out.println("========================");
		System.out.println(treeSet.ceiling(160));
		System.out.println(treeSet.floor(65));
		
		System.out.println("========================");
		System.out.println(treeSet.headSet(100));
		System.out.println(treeSet.headSet(100,true));
		
		System.out.println("========================");
		System.out.println(treeSet.tailSet(78));
		System.out.println(treeSet.tailSet(78,false));
		
		
		System.out.println("=======================");
		
		System.out.println(treeSet.subSet(19, 100));
		System.out.println(treeSet.subSet(19,false, 100,true));
		
		System.out.println("=======================");
		System.out.println(treeSet.subSet(19, 100));
		
		
		
		
		
		
		
		
		System.out.println();
		
	}

}
