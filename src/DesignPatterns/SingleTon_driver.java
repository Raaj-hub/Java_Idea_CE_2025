package DesignPatterns;

public class SingleTon_driver {

    public static void main(String[] args) {
       TV_set mem1 = TV_set.getTVSETinstance("onida");
       TV_set mem2 = TV_set.getTVSETinstance("Samsung");
//        TV_set mem3 = TV_set.getTVSETinstance();

//        TV_set mem1 = new TV_set("onida");
//        TV_set mem2 = new TV_set("samsung");

        System.out.println(mem1);
        System.out.println(mem2);
       // System.out.println(mem3);
        System.out.println(mem1==mem2);
    }

}
