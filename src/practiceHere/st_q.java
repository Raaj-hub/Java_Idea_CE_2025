package practiceHere;

import java.util.LinkedList;
import java.util.Queue;

public class st_q {
    public static void main(String[] args) {

        st_q sq ;
        sq = new st_q();

        sq.enq(10);
        sq.enq(20);
        sq.enq(30);
        sq.enq(40);
        System.out.println(st_q.q);
        sq.deq();
        System.out.println(st_q.q);
    }
        static Queue q = new LinkedList();
    private static void enq(int number)
    {
        int qsize = q.size();
        q.add(number);
        for(int i=0 ;i<qsize; i++)
        {
            q.add(q.remove());
        }
    }

    private static void deq()
    {
        System.out.println(q.remove());
    }

}
