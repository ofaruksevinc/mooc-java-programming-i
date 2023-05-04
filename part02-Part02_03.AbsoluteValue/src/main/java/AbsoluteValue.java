
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = Integer.valueOf(scanner.nextLine());
        if (sayi < 0) {
            int negatif = -sayi;
            System.out.println(negatif);
        } else {
            System.out.println(sayi);
        }
    }
}
