package THREADING;

public class Thread_Methods extends Thread{
    public static void main(String[] args) throws InterruptedException {

        Thread_Methods t1 = new Thread_Methods();

        t1.start();
        t1.join();
        System.out.println("waiting for the completion of prev thread");


    }

    public void run()
    {
       for(int i=1 ; i<=6; i++)
       {
//           try {
//               Thread.sleep(2000);
//           } catch (InterruptedException e) {
//               throw new RuntimeException(e);
//           }
           System.out.println(i);
       }
    }
}
