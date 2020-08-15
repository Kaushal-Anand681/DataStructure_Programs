package LinkedList;


import java.util.*;


public class LinkedListCreation  {

	static class DoublyLinkedList {
		public Node head;
		public Node tail;

		public void setHead(Node node) {
			// Write your code here.
			if (head == null) {
				head = tail = node;
				return;
			} 
				insertBefore(head, node);
			
		}

		public void setTail(Node node) {
			// Write your code here.
			if (tail == null) {
				setHead(node);
				return;
			}
			insertAfter(tail, node);
		}

		public void insertBefore(Node node, Node nodeToInsert) {
			// Write your code here.
			if (nodeToInsert == head && nodeToInsert == tail) {
				return;
			}
			// if nodeToInsert is already present
			remove(nodeToInsert);
			nodeToInsert.prev = node.prev;
			nodeToInsert.next = node;
			if (node.prev == null) {
				head = nodeToInsert;
			} else {
				node.prev.next = nodeToInsert;
			}
			node.prev = nodeToInsert;
		}

		public void insertAfter(Node node, Node nodeToInsert) {
			// Write your code here.
			if (nodeToInsert == head && nodeToInsert == tail) {
				return;
			}
			remove(nodeToInsert);
			nodeToInsert.prev = node;
			nodeToInsert.next = node.next;
			if (node.next == null) {
				tail = nodeToInsert;
			} else {
				node.next.prev = nodeToInsert;
			}
			node.next = nodeToInsert;
		}

		public void insertAtPosition(int position, Node nodeToInsert) {
			if (position == 1) {
				setHead(nodeToInsert);
				return;
			}
			int currentPosition = 1;
			Node temp = head;
			while (temp != null && currentPosition++ != position) {
				temp = temp.next;
			}
			if (temp != null) {
				insertBefore(temp, nodeToInsert);
			} else {
				setTail(nodeToInsert);
			}
		}

		public void removeNodesWithValue(int value) {
			// Write your code here.
			Node temp = head;
			while(temp != null) {
				Node nodeToRemove = temp;
				temp = temp.next;
				if(nodeToRemove.value == value){
					remove(nodeToRemove);
				}
		}
		}

		public void remove(Node node) {
			// Write your code here.
			if (node == head) {
				head = head.next;
			}
			if (node == tail) {
				tail = tail.prev;
			}
			removeNodeBindings(node);
		
		}
			public void removeNodeBindings(Node node){
					if (node.prev != null) {
						node.prev.next = node.next;
			}
			if (node.next != null) {
				node.next.prev = node.prev;
			}
			node.prev = null;
			node.next = null;
			}

		public boolean containsNodeWithValue(int value) {
			// Write your code here.
			Node node = head;
			while (node != null && node.value != value) {
				node = node.next;
			}
			return node != null;
		}
	}

// Do not edit the class below.
	static class Node {
		public int value;
		public Node prev;
		public Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
