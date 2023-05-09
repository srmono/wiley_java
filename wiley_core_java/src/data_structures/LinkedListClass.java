package data_structures;

import java.net.SecureCacheResponse;

public class LinkedListClass {

	Node head;

	static class Node {
		int value;
		Node next;

		public Node(int d) {
			value = d;
			next = null;
		}
	}

	// Insert at the end
	// insert at the beginning
	// Insert in the middle
	// Delete at the end
	// Delete at the beginning
	// Delete in the middle
	// Print linkedList
	// Search node by key  (head, key)
	// sort the linked list
	void sortedLinkedList(Node head) {
		Node current = head;
		Node index = null;
		int temp;
		
		if(head == null) {
			return; //false
		} else {
			while(current != null) {
				//index point to the node next to the current
				index = current.next;
				while(index !=null) {
					if(current.value > index.value) {
						current.value = index.value;
						temp = current.value;
						index.value = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedListClass linkedList = new LinkedListClass();

		//Assign the value
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Connect nodes
		linkedList.head.next = second;
		second.next = third;
		
		// Printing node-value
		while(linkedList.head != null) {
			System.out.println(linkedList.head.value + " ");
			linkedList.head = linkedList.head.next;
		}
		
		
	}

}
