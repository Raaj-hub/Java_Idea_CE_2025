package practiceHere;

import java.util.Stack;

public class q_st {
    public static void main(String[] args) {

        q_st qs ;
        qs = new q_st();
        qs.push(10);
        qs.push(20);
        qs.push(30);
        qs.push(40);
        System.out.println(qs.st1);
        qs.del();

        System.out.println(qs.st2);
    }
        Stack st1 = new Stack();
    Stack st2 = new Stack();
    private void push(int number)
    {
        st1.push(number);
    }

    private void del()
    {
        if (st2.isEmpty())
        {
            while (!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
        }
        System.out.println(st2.pop());
    }

}
