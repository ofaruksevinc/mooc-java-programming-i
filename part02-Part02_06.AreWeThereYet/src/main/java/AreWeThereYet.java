import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Give a number:");
        while ((number = scanner.nextInt()) != 4) {
            System.out.println("Give a number:");
        }

        System.out.println("You entered 4.");
    }
}
