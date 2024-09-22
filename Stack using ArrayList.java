package Stack_Problem;
import java.util.*;
public class Stack_ArrayList {
	public static class Stack{
		ArrayList<Integer> list = new ArrayList<Integer>();
		public void Push(int data) {
			list.add(data);
			return;
		}
		public int pop() {
			if(list.isEmpty()) {
				return -1;
			}
			int val = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return val;
		}
		public int peek() {
			if(list.isEmpty()) {
				return -1;
			}
			return list.get(list.size() -1);
		}
	}
	public static void main(String[] args) {
		Stack S = new Stack();
		S.Push(10);
		S.Push(20);
		S.Push(30);
		System.out.println(S.pop());
		System.out.println(S.peek());
	}
}
