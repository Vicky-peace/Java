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
