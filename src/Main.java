public class Main {
    public static void main(String[] args) {
        // Integers
        int intOperandA = 12;
        int intOperandB = 5;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;   // ⚠ int division
        int intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // Doubles
        double doubleOperandA = 12.5;
        double doubleOperandB = 4.2;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("\nThe sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        boolean isRaining = true;
        double gasPrice = 4.10;
        int favoriteNumber = 44;
        double shoeSize = 10.5;
        int birthMonth = 4;
        String fullName = "Jackson Willett";

        System.out.println("Is it raining? " + isRaining);
        System.out.println("Price of a gallon of gas: " + gasPrice);
        System.out.println("My favorite number: " + favoriteNumber);
        System.out.println("My shoe size: " + shoeSize);
        System.out.println("My birth month: " + birthMonth);
        System.out.println("My full name: " + fullName);
    }
}
