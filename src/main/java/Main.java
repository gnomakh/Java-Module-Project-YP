public class Main {
    public static void main(String[] args) {
        Checkers checker = new Checkers();
        Goods goods = new Goods();
        Calculator calculator = new Calculator();
        Formatter formatter = new Formatter();

        System.out.println("Введите размер Вашей компании :)");

        calculator.addPals(checker.isInt());

        System.out.println("Окей, давайте Вас рассчитаем :)");

        goods.addMeal();
        goods.printTotalGoods();
        Double total = calculator.split(goods.returnTotalCost(), calculator.returnPals());
        System.out.println("С каждого: " + formatter.correctCost(formatter.formatDouble(total)));
    }
}