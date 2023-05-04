
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Give a number:");

            number = scanner.nextInt();

            if (number > 0) {
                int square = number * number;
                System.out.println("The square of the number is " + square);
            } else if (number < 0) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }
        }
    }
}
