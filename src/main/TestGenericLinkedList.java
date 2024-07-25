package main;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class TestGenericLinkedList {

	public static void main(String[] args) {

		// Generic Tests
		// Integer List
		GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
		
		GenericNode<Integer> intNode = new GenericNode<Integer>();
		intNode.setData(5);
		intList.addNode(intNode);
		System.out.println(intList.getList());
		
		// Double List
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		doubleNode.setData(2.3);
		doubleList.addNode(doubleNode);
		System.out.println(doubleList.getList());

		// String List
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		
		GenericNode<String> strNode = new GenericNode<String>();
		strNode.setData("Hello");
		stringList.addNode(strNode);
		System.out.println(stringList.getList());

	}

}
