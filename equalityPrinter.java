/**
 *  Name: Samuel Adams Adjin
 */

public class EqualityPrinter {

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber < 0) || (secondNumber < 0) || (thirdNumber < 0)) {
            System.out.println("Invalid Value");

        } else if ((thirdNumber == firstNumber && thirdNumber == secondNumber)) {
            System.out.println("All numbers are equal");
        } else if (!(secondNumber == firstNumber || secondNumber == thirdNumber) && !(thirdNumber == firstNumber)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
