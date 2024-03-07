import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class Checkers {
    public int isInt() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            if (scan.hasNextInt()) {
                int intToCheck = scan.nextInt();

                if (intToCheck > 1) {
                    return intToCheck;
                } else if (intToCheck == 1) {
                    System.out.println("Так ты же один, чего тут считать? :O");
                } else if (intToCheck < 0) {
                    System.out.println("Введи положительное число!");
                } else {
                    System.out.println("Никто не пришел на ужин? :C");
                }
            } else {
                System.out.println("Не-а, введи корректное число!");
                scan.next();
            }
        }
    }

    public Double isCorrectCost() {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            try {
                String strToDouble = String.format("%.2f", scan.nextDouble()).replace(",", ".");
                Double validDouble = Double.valueOf(strToDouble);

                if (validDouble < 0.01) {
                    System.out.println("Цена должна быть больше нуля!");
                } else {
                    return validDouble;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введи корректную стоимость!");
                scan.next();
            }
        }
    }
}
