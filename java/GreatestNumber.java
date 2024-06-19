import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int  number1 = scanner.nextInt();

        System.out.println("Type the second number: ");
        int  number2 = scanner.nextInt();

        System.out.println("Type the third number :");
        int  number3 = scanner.nextInt();

        int greatestNumber = getGreatestNumber(number1, number2, number3);
        System.out.println("The numbers you were input are " + number1 + ", " + number2 + ", " + number3 + ", and the greatest number is: " + greatestNumber);
    }

    static int getGreatestNumber(int number1, int number2, int number3) {
        int greatestNumber = 0;
        if (number1 < number2) {
            greatestNumber = number2;
        } else greatestNumber = number1;
        if (greatestNumber < number3) {
            greatestNumber = number3;
        }
        return greatestNumber;
    }
}
