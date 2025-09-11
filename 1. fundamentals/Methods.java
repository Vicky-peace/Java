
//Learning methods
public class Methods {
    static void MyMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        MyMethod();
    }
}

// Parameters and arguments - Parameters are variables that act as placeholders
// for the values that you pass to a method when you call it. The values that
// you pass to the method are called arguments.
class Parameters {
    static void myMethods(String fname) {
        System.out.println(fname + " Fredrick");
    }

    public static void main(String[] args) {
        myMethods("Liam");
        myMethods("Collins");
        myMethods("Ngechu");
    }
}

// Multiple parameters
class MultipleParameters {
    static void mymethod(String fname, int age) {
        System.out.println(fname + "is " + age);
    }

    public static void main(String[] args) {
        mymethod("Liam", 5);
        mymethod("Collins", 6);
        mymethod("Ngechu", 7);
    }
}

// A method with if...else
class IfElse {
    // Create a CheckAge method with an integer variable called age
    static void checkAge(int age) {

        // if age is less than 118, print " access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(23);
    }
}

// Return Values
class ReturnValues {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}

class ReturnValues2 {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
    }
}

class DoubleGame {
    static int doubleGame(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(doubleGame(i));
        }
    }
}

// Method Overloading - When multiple methods share the same name but have
// different parameters
// example without method overloading
class MethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}

// example with method overloading
class MethodOverloading2 {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}