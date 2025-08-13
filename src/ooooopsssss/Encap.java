package ooooopsssss;

// Main.java
public class Encap {
    public static void main(String[] args) {
        // Create an instance of the Person class
//        Person person1 = new Person("Alice", 30);
//
//        // Access data using getter methods
//        System.out.println("Name: " + person1.getName());
//        System.out.println("Age: " + person1.getAge());
//
//        // Modify data using setter methods
//        person1.setName("Bob");
//        person1.setAge(25);
//
//        System.out.println("Updated Name: " + person1.getName());
//        System.out.println("Updated Age: " + person1.getAge());
//
//        // Attempt to set an invalid age (validation in setter will prevent this)
//        person1.setAge(-5);
//        System.out.println("Age after invalid attempt: " + person1.getAge()); // Age remains 25



        Human_Encaps hum = new Human_Encaps();
        hum.setModel("tata"); hum.setWheels(4);
        System.out.println(hum.getWheels() +" : "+ hum.getModel());

    }
}
