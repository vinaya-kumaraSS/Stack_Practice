import java.util.*;
public class LinkedList
{
    static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
           s.push(data);
           return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
	public static void main(String[] args) {
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.push(40);
	    pushAtBottom(s,4);
	    while(!s.isEmpty()){
	        System.out.println(s.peek());
	        s.pop();
	    }
	}
}
