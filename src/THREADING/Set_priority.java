package THREADING;

public class Set_priority extends Thread
{
    String name;
    public Set_priority(String name)
    {
        super(name);
    }
    public static void main(String[] args) {

        Set_priority low = new Set_priority("Low prio thread");
        Set_priority med = new Set_priority("med prio threadaj");
        Set_priority high = new Set_priority("high prio thread");

           low.setPriority(Thread.MIN_PRIORITY);
           med.setPriority(Thread.NORM_PRIORITY);
           high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        med.start();
        high.start();



        }

        public void run()
        {
            for(int i=1 ; i<=6; i++)
            {
                for(int j=1 ; j<=2; i++) {
                    System.out.println(Thread.currentThread().getName() + "- priority " +
                            Thread.currentThread().getPriority() + "- count-" + i);
                }
                try{
                    Thread.sleep(1000);

            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }

}
