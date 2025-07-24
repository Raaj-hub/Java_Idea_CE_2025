package ooooopsssss;

public class Over_loading
{
         static int add(int a, int b) { return a + b; }

         static int add(int a, int b, int c)
        {
            return a + b + c;
        }
        static void add(int c)
        {
            System.out.println(c+c);
        }

        // Main Function
        public static void main(String args[])
        {
            System.out.println("add() with 2 parameters");

            // Calling function with 2 parameters
            System.out.println(add(4, 6));

            System.out.println("add() with 3 parameters");

            // Calling function with 3 Parameters
            System.out.println(add(4, 6, 7));

            add(4);
        }

}
