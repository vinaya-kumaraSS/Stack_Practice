import java.util.*;
public class LinkedList
{
    static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    
    static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
    static void displayStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
	public static void main(String[] args) {
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	   // displayStack(s);
	    reverseStack(s);
	    displayStack(s);
	}
}
