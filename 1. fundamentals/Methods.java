
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