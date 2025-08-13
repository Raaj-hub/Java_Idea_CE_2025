package THREADING;

public class Yield_thread extends Thread{

    public Yield_thread(String name)
    {
        super(name);
    }

    public static void main(String[] args) {



Yield_thread t1 = new Yield_thread("Thread 1");
Yield_thread t2 = new Yield_thread("Thread 2");

t1.start();
t2.start();



    }

    public void run()
    {
        for(int i=1 ; i<=6; i++)
        {
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
        }
    }
}
