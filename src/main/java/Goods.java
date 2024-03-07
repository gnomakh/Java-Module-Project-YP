import java.util.ArrayList;

public class Goods {
    ArrayList<String> mealList = new ArrayList<>();
    ArrayList<Double> costList = new ArrayList<>();
    Double totalCost = 0.00;

    public void addMeal(String meal, Double cost) {
        mealList.add(meal);
        costList.add(cost);

        totalCost += cost;

    }

    public void printTotalGoods() {
        System.out.println("Добавленные товары:");

        for (int i = 0; i < mealList.size(); i++) {
            System.out.println(i + 1 + ". " + mealList.get(i) + " " + costList.get(i));
        }

        System.out.println("Итог: " + totalCost);
    }

}
