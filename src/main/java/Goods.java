import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Goods {
    ArrayList<String> mealList = new ArrayList<>();
    ArrayList<Double> costList = new ArrayList<>();
    Double totalCost = 0.00;

    public void addMeal() {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        Checkers checker = new Checkers();
        boolean inputIsEmpty = false;

        for (int i = 0; true; i++) {
            if (!inputIsEmpty) {
                System.out.print(i == 0 ? "Введите название блюда: " : "Введите название блюда или \"Завершить\": ");
            } else {
                System.out.print("Введите хоть что-нибудь!: ");
                inputIsEmpty = false;
            }
            String addNextMeal = scan.nextLine();

            if (addNextMeal.equalsIgnoreCase("Завершить")) {
                break;
            } else if (addNextMeal.equals(" ") || addNextMeal.equals("")) {
                inputIsEmpty = true;
                continue;
            } else {
                mealList.add(addNextMeal);
            }

            System.out.print("Введите стоимость блюда: ");

            Double addNextCost = checker.isCorrectCost();
            costList.add(addNextCost);
            totalCost += addNextCost;

            System.out.println("\nТовар добавлен! Желаете добавить что-то еще?");
        }
    }

    public void printTotalGoods() {
        Formatter formatter = new Formatter();
        System.out.println("Добавленные товары:");

        for (int i = 0; i < mealList.size(); i++) {
            System.out.println(i + 1 + ". " + mealList.get(i) + " " + formatter.correctCost(costList.get(i)));
        }

        System.out.println("Итог: " + formatter.correctCost(formatter.formatDouble(totalCost)));
    }

    public Double returnTotalCost() {
        return totalCost;
    }
}
