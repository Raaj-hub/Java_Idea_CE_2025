package January_2026;

public class DemoFinal {
    final int i;

    DemoFinal() {
        i = 9;
       // System.out.println(i);
    }

    public static void main(String[] args) {
        DemoFinal ex = new DemoFinal();
        System.out.println(ex.i);
    }
}