import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class Checkers {
    public int isInt() {
        Scanner scan = new Scanner(System.in);
        int intToCheck;

        while (true) {
            try {
                intToCheck = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Не-а, введите корректное число!");
                scan.next();
                continue;
            }

            if (intToCheck > 1) {
                return intToCheck;
            } else if (intToCheck == 1) {
                System.out.println("Так Вы же один, чего тут считать? :O");
            } else if (intToCheck < 0) {
                System.out.println("Введите положительное число!");
            } else {
                System.out.println("Никто не пришел на ужин? :C");
            }
        }
    }

    public Double isCorrectCost() {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Formatter formatter = new Formatter();
        Double validDouble;

        while (true) {
            try {
                validDouble = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Введите корректную стоимость!");
                scan.next();
                continue;
            }

            if (validDouble < 0.01) {
                System.out.println("Цена должна быть больше нуля!");
            } else {
                return formatter.formatDouble(validDouble);
            }
        }
    }
}
