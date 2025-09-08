// ================Data Types================

// public class Main {
// public static void main(String[] args) {
// // Widening casting (Automatically) - converting a smaller type to a larger
// type
// int myInt = 9;
// double myDouble = myInt; // Automatic casting: int to double

// System.out.println("Int: " + myInt);
// System.out.println("Double: " + myDouble);

// // Narrowing casting (Manually) - converting a larger type to a smaller type
// double myDouble2 = 9.78d;
// int myInt2 = (int) myDouble2; // Manual casting: double to int

// System.out.println("Double: " + myDouble2);
// System.out.println("Int: " + myInt2);
// }
// }

// package fundamentals;

// public class Main {
// public static void main(String[] args) {
// // Set A maximum possible score in the game to 500
// int maxScore = 500;

// // The actual score of the user
// int userScore = 423;

// /*
// * Calculate the percentage of the user's score in relation to the max
// available
// * score.
// * Convert the user score to float and make sure the division is accurate
// */
// float percentage = (float) userScore / maxScore * 100.0f;

// // Print the percentage
// System.out.println("User's score percentage: " + percentage + "%");
// }
// }

// package fundamentals;

// public class Main {
// public static void main(String[] args) {
// String name = "Peace";
// int age = 25;
// double height = 5.9;
// boolean isStudent = true;
// System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height
// + ", Is Student: " + isStudent);
// }
// }

// ================Numbers================> bit , short , long , float
// ----- type casting => converting one data type to another data type

// public class Main {
// public static void main(String[] args) {
// int num = 10;
// double d = num; // impliicit casting (widening)
// System.out.println("Double value: " + d);

// double pi = 3.14;
// int intPi = (int) pi; // explicit casting (narrowing)
// System.out.println("Int value of pi: " + intPi);

// }
// }

// ================If else statements================
// public class Main {
// public static void main(String[] args) {
// int age = 20;
// if (age >= 18) {
// System.out.println("Youre eligible to vote");
// } else {
// System.out.println("Youre not eligible to vote");
// }

// // Nested if else statements
// if (age >= 18) {
// if (age < 21) {
// System.out.println("You can vote but cannot drink alcohol");
// } else {
// System.out.println("You can vote and drink alcohol");
// }
// } else {
// System.out.println("You are too young to votte and drink alcohol");
// }
// }
// }

// ================Switch statements================
// public class Main {
// public static void main(String[] args) {
// int day = 3;
// switch (day) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// case 7:
// System.out.println("Sunday");
// break;
// default:
// System.out.println("Invalid day");
// }
// }
// }

// ================Loops================
// public class Main {
// public static void main(String[] args) {
// // For loop
// for (int i = 0; i <= 5; i++) {
// System.out.println("For loop iteration: " + i);
// }

// // While loop
// int j = 1;
// while (j <= 5) {
// System.out.println("While loop iteration: " + j);
// j++;
// }

// // Do-While loop
// int k = 1;
// do {
// System.out.println("Do-While loop iteration: " + k);
// k++;
// } while (k <= 5);
// }
// }

// public class Main {
// public static void main(String[] args) {
// int x = 20;

// if (x > 10 && x <= 20) {
// System.out.println("Hello");
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// int doorCode = 1337;

// if (doorCode == 1333) {
// System.out.println("Correct door code! You may enter.");
// } else {
// System.out.println("Incorrect door code! Access denied.");
// }
// }
// }

// ================For Loop================
// This code demonstrates a simple for loop that prints numbers from 0 to 4.
// public class Main {
// public static void main(String[] args) {

// for (int i = 0; i < 5; i++) {
// System.out.println(i);
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// // This example prints even values between 0 and 10:
// for (int i = 0; i <= 10; i = i + 2) {
// System.out.println(i);
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// // This example prints a countdown from 5 to 1:
// for (int i = 5; i > 0; i--) {
// System.out.println(i);
// }
// System.out.println("Liftoff!");
// }
// }

// === ===============Nested loops=========
// public class Main {
// public static void main(String[] args) {
// for (int i = 1; i <= 2; i++) {
// System.out.println("Outer loop iteration: " + i); // Executes 2 times

// // Inner loop
// for (int j = 1; j <= 3; j++) {
// System.out.println(" Inner loop iteration: " + j); // Executes 6 times (2 *
// 3)
// }
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// for (int i = 1; i <= 3; i++) {
// for (int j = 1; j <= 3; j++) {
// System.out.print(i * j + " ");
// }
// System.out.println();
// }
// }
// }

// ================for-each Loop================
// public class Main {
// public static void main(String[] args) {
// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
// for (String i : cars) {
// System.out.println(i);
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// for (int i = 0; i <= 100; i += 10) { // program that counts to 100 by tens:
// if (i % 2 == 0) {
// System.out.println(i + " is even");
// } else {
// System.out.println(i + " is odd");
// }
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// for (int i = 0; i <= 10; i++) {
// if (i == 4) {
// continue;
// }
// System.out.println(i);
// }
// }
// }

// =================Arrays=================
// public class Main {
// public static void main(String[] args) {
// double[] lotteryNums = { 45, 92, 38, 33, 21 };
// System.out.println(lotteryNums[0]);
// }
// }

// Iterating through arrays
// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// int[] arr = new int[] { 1, 2, 3, 4, 5 };
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
// }
// System.out.println();

// for (int i = arr.length - 1; i >= 0; i--) {
// System.out.println(arr[i]);
// }
// System.out.println();

// for (int i = arr.length - 1; i >= 0; i = i - 2) { // Print every second
// element in reverse order
// System.out.println(arr[i]);

// }
// System.out.println();

// for (int item : arr) {
// System.out.println(item);
// }
// System.out.println();

// // Java streams
// Arrays.stream(arr).forEach(System.out::println);
// }
// }

// This example demonstrates how to initialize an array and traverse it using a
// for loop to print each element.

// public class Main {
// public static void main(String[] args) {

// // initializing the array
// int[] arr = { 1, 2, 3, 4, 5 };

// // the size of an array
// int n = arr.length;

// // traversing the array
// for (int i = 0; i < n; i++) {
// System.out.println(arr[i] + " ");
// }

// }
// }

// public class Main {
// public static void main(String[] args) {

// // declare an Array of integer
// int[] arr;

// // Allocating a memmery of 5 integers
// arr = new int[5];

// // initialize the elements of the array
// // first to the last fifth element
// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;
// arr[3] = 40;
// arr[4] = 50;

// // accessing the elements of the specified array
// for (int i = 0; i < arr.length; i++) {
// System.out.println("Element at index " + i + ": " + arr[i]);
// }
// }
// }

// create a function that finds the second smallest item an integer array
// input:{5,8,3,2,6,1,4,7}

public class arrays {
    public static void main(String[] args) {
        int[] numbers = { 5, 0, 8, 0, 10 };
        System.out.println(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}