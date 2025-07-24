package xxxtrraaaaa;

import java.time.Duration;
import java.time.Instant;

public class Sync_sync {

    synchronized void print()
        {
            for (int i=1; i<=5; i++)
            {
                System.out.println(1);
           }
        }


         void log()
        {for (int i=1; i<=5; i++)
        {
            System.out.println(1);
        }
        }

    public static void main(String[] args) {

        Sync_sync sync = new Sync_sync();

      //  long stLog = System.nanoTime();
        Instant start = Instant.now();
        sync.log();
        Instant en = Instant.now();
        long T = Duration.between(start,en).toNanos();
        System.out.println(T);

        Instant st = Instant.now();
        sync.print();
        Instant end = Instant.now();
        long time = Duration.between(st,end).toNanos();
        System.out.println(time);

    }
}
