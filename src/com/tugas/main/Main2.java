package com.tugas.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javafx.print.Collation;

public class Main2 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Rifqi1");
		arrayList.add("Fathan2");
		arrayList.add("Iqbal3");
		arrayList.add("Andi4");
		arrayList.add("Rony5");
		arrayList.add("Fahri6");
		arrayList.add("Rendra7");
		arrayList.add("Romy8");
		arrayList.add("Reza9");
		
//		Set<Integer> hashSet = new HashSet<Integer>();
//		hashSet.add(1);
//		hashSet.add(2);
//		hashSet.add(4);
//		hashSet.add(6);
//		hashSet.add(5);
//		hashSet.add(8);
//		hashSet.add(7);
//		hashSet.add(9);
//		hashSet.add(3);

		Set<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Rifqi1");
		hashSet2.add("Fathan2");
		hashSet2.add("Iqbal3");
		hashSet2.add("Andi4");
		hashSet2.add("Rony5");
		hashSet2.add("Fahri6");
		hashSet2.add("Rendra7");
		hashSet2.add("Romy8");
		hashSet2.add("Reza9");
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Rifqi1");
		linkedHashSet.add("Fathan2");
		linkedHashSet.add("Iqbal3");
		linkedHashSet.add("Andi4");
		linkedHashSet.add("Rony5");
		linkedHashSet.add("Fahri6");
		linkedHashSet.add("Rendra7");
		linkedHashSet.add("Romy8");
		linkedHashSet.add("Reza9");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Rifqi1");
		linkedList.add("Fathan2");
		linkedList.add("Iqbal3");
		linkedList.add("Andi4");
		linkedList.add("Rony5");
		linkedList.add("Fahri6");
		linkedList.add("Rendra7");
		linkedList.add("Romy8");
		linkedList.add("Reza9");
		
		
		System.out.println("Printed as ArrayList : ");
		printName(arrayList);
		System.out.println("\n");		
//		System.out.println("Printed as HashSet Integer : ");
//		printName(hashSet);
		System.out.println("Printed as HashSet String : ");
		printName(hashSet2);
		System.out.println("\n");
		System.out.println("Printed as LinkedHashSet : ");
		printName(linkedHashSet);
		System.out.println("\n");
		System.out.println("Printed as LinkedList : ");
		printName(linkedList);
		
	}

	private static void printName(Set<String> hashSet2) {
		for (String string2 : hashSet2) {
			System.out.println(string2);
		}
	}

	private static void printName(LinkedHashSet<String> linkedHashSet) {
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
	}

//	private static void printName(Set<Integer> hashSet) {
//		for (Integer integer : hashSet) {
//			System.out.println(integer);
//		}
//	}

	private static void printName(List<String> arrayList) {
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

}
