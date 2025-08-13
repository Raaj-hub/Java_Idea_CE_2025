package ooooopsssss;

// Person.java
public class Person {
    // Private attributes (data is hidden from direct external access)
    private String name;
    private int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        // Apply validation in the setter to ensure valid data
        setAge(age); 
    }

    // Public getter method for 'name' to allow reading the value
    public String getName() {
        return name;
    }

    // Public setter method for 'name' to allow controlled modification
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age' with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Example validation: age must be non-negative and realistic
            this.age = age;
        } else {
            System.out.println("Invalid age provided. Age must be between 0 and 120.");
        }
    }
}

