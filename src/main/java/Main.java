import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checkers checker = new Checkers();


        System.out.println("Введите размер Вашей компании :)");

        int howManyPals = checker.isInt();
        Calculator calculator = new Calculator(howManyPals);

        System.out.println("Окей, давайте Вас рассчитаем :)");

        calculator.count();


    }
}