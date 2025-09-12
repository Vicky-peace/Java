// A class is a blueprint for creating objects. A class can contain fields
// (attributes) and methods (functions) that define the behavior of the objects
// created from the class.
// In Java, a class is defined using the "class" keyword followed by the class
// name and a pair of curly braces that enclose the class body.

// An object is an instance of a class. When a class is instantiated, memory is
// allocated for the object, and the object's fields are initialized.

class MyClass {
    int x = 5;

    public static void main(String[] args) {
        // object creation
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
}

// creating multipple objects of a class
class MyClass2 {
    int x = 5;

    public static void main(String[] args) {
        MyClass2 myObj1 = new MyClass2();
        MyClass2 myObj2 = new MyClass2();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

    }
}

// Java class Attributes
// Class attributes are the variables that belong to a class. They are used to
// store the state or properties of an object created from the class.
class Car {
    String color = "red";
    int year = 2020;

    public static void main(String[] args) {
        Car myObj = new Car();
        System.out.println(myObj.color);
        System.out.println(myObj.year);
    }
}

// Overriding attributes
class MyClass3 {
    int x = 10;

    public static void main(String[] args) {
        MyClass3 myObj = new MyClass3();
        myObj.x = 25; // x attribute is now 25
        System.out.println(myObj.x);
    }
}