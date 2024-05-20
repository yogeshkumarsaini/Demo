package Day14.Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(null);
        s.push(null);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.add(10));
        System.out.println(s.contains(5));
        System.out.println(s.capacity());
        System.out.println(s.size());
        System.out.println(s.lastElement());
        System.out.println(s.remove(3));
        System.out.println(s);
    }
}
