package fundamentals.DataTypes;

public class TypeCasting {
    public static void main(String a[]) {
        // Widening casting(Automatically)- convertiing a smaller type to a larger type
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Int: " + myInt);
        System.out.println("Double: " + myDouble);

        // Narrowing casting(Manually) - converting a larger type to a smaller type
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("Double: " + myDouble2);
        System.out.println("Int: " + myInt2);
    }
}

class TypeCastingExample {
    public static void main(String a[]) {
        // Set A maximu possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
         * Calculate the percentage of the user's score in relation to the max available
         * score .
         * Convert the user score to float and make sure the division is accurate
         */
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the percentage
        System.out.println("User's score percentage: " + percentage + "%");
    }
}