import java.util.*;
public class Main
{
    static String reverseString(String str){
        Stack<Character> s = new Stack<Character>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder strBuf = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            strBuf.append(curr);
        }
        return strBuf.toString();
    }
	public static void main(String[] args) {
	    String str = "vinay";
	    System.out.println(reverseString(str));
	}
}
