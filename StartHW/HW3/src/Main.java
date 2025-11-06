import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int trueDays;
        int points = 0;
        while (true) {
            System.out.println("Введите год в формате yyyy");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();
            trueDays = Checker.checkYear(year, days);
            if (trueDays != days) {
                System.out.println("Неправильно! В этом году " + trueDays + " дней!");
                System.out.println("Набрано очков: " + points);
                break;
            }
            points += 1;
        }
        scanner.close();

    }
}