package LinkedList;

public class ReverseLinkedList {
	public static LinkedList reverseLinkedList(LinkedList head) {
		LinkedList p1 = null;
		LinkedList p2 = head;
		while(p2 != null) {
			LinkedList p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;
		}
		return p1;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}

}
