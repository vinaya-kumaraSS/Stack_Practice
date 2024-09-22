package Stack_Problem;
import java.util.*;
public class StackCollection {
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
