import java.util.Scanner;
import java.util.Iterator;
import java.util.Locale;

public class Calculator {
    int howManyPals;

    Calculator(int howManyPals) {
        this.howManyPals = howManyPals;
    }

    public void count() {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        Goods goods = new Goods();
        Checkers checker = new Checkers();

        String totalGoods;

        while (true) {
            String addNextMeal = scan.nextLine();

            if (addNextMeal.equalsIgnoreCase("Завершить")) {
                break;
            }

            Double addNextCost = checker.isCorrectCost();

            goods.addMeal(addNextMeal, addNextCost);
            System.out.println("Товар добавлен! Желаете добавить что-то еще?");
        }

        goods.printTotalGoods();
    }
}
