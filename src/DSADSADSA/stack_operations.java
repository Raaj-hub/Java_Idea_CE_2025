package DSADSADSA;

import java.util.Stack;

public class stack_operations
{
    public static void main(String[] args) {

        Stack st = new Stack();
        st.add(6);
        st.add('a');
        st.add("one");
        st.addFirst(5);
        st.push(8);
        st.add(0);
        st.addFirst('z');
       // st.push("ab");
//
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search(6));
        System.out.println(st);

        System.out.println(st.isEmpty());


    }
}
