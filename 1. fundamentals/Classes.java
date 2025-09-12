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

// Java Methods
// A method is a block of code that performs a specific task. It is similar to a
// function in other programming languages. In Java, a method is defined using
// the "return_type method_name(parameters)" syntax.
class MyClass4 {
    // method definition
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod(); // method call
    }
}

// Static vs public
// A static method belongs to the class itself, rather than to any specific
// instance of the class. This means that you can call a static method without
// creating an object of the class.

// A public method, on the other hand, belongs to an instance of the class. This
// means that you need to create an object of the class in order to call a
// public method.

class StaticVsPublic {
    // static method
    static void myStaticMetghhod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("public Methods must be called by creating objects");
    }

    // Main Method
    public static void main(String[] args) {
        myStaticMetghhod(); // call static method

        StaticVsPublic myObj = new StaticVsPublic(); // create object
        myObj.myPublicMethod(); // call public method
    }
}

// access methods with an object
class AccessMethods {
    // create a fullThrottle method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // create a speed() method and add a paramater
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        AccessMethods myCar = new AccessMethods(); // Create a myCar object
        myCar.fullThrottle(); // call the fullThrottle method
        myCar.speed(200); // call the speed method

    }
}

// Constructors
// A consstructor is a special method used to initialize objects.
// The constructor is called when an object of a class is created. It can be
// used to
// set initial values for object attributes.
class Car2 {
    String model;
    int year;

    // constructor
    public Car2() {
        model = "Mustang";
        year = 1969;
    }

    public static void main(String[] args) {
        Car2 myCar = new Car2();
        System.out.println(myCar.model + " " + myCar.year);
    }
}
