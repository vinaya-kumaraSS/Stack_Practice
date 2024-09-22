package Stack_Problem;

public class Stack_LinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class Stack{
		static Node head = null;
		
		public static boolean isEmpty() {
			return head == null;
		}
		
		public static void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
			return;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		public static int peak() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		Stack S = new Stack();
		S.push(10);
		S.push(20);
		S.push(30);
		System.out.println(S.pop());
		System.out.println(S.peak());
	}
}
