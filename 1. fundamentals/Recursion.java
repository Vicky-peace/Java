// Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems into simpler problems which are easier to solve.
// A method that calls itself is called a recursive method.
class Recursion {
    public static void main(String[] args) {
        sayHi(5);
    }

    private static void sayHi(int count) {
        System.out.println("Hi");

        if (count > 1) {
            return;
        }
        sayHi(count - 1);
    }
}

// Adding two numbers together is easy to do,but adding a range of numbers is
// more complicated. In the following exmaple recursion is used to adda range of
// numbers together by breaking it dowwn into simple task of addding two
// numbers:

class Recursion2 {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}

class Recursion3 {
    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}