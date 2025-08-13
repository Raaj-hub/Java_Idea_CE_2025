package ooooopsssss;// Method overloading By using
// Different Types of Arguments

import static ooooopsssss.Helper.Multiply;

// Class 1
// Helper class
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
     static  void Multiply(float a)
    {
        // Returns product of double numbers
        System.out.println(a*a);
    }
}

// Class 2
// Main class
class Geeks
{
    // Main driver method
    public static void main(String[] args) {
      
        // Calling method by passing
        // input as in arguments
        System.out.println(Multiply(2, 4));
        System.out.println(Multiply(5.5, 6.3));
        Helper.Multiply(10f);
    }

}