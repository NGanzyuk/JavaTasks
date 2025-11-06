import java.util.Scanner;

public class Main {
    public static void listOfOperations() {
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Выбрать систему налогообложения");
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;
        while (true) {
            listOfOperations();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyEarningsStr = scanner.nextLine();
                    int moneyEarned = Integer.parseInt(moneyEarningsStr);
                    earnings += moneyEarned;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneySpendingsStr = scanner.nextLine();
                    int moneySpend = Integer.parseInt(moneySpendingsStr);
                    spendings += moneySpend;
                    break;
                case 3:
                    System.out.println(earnings);
                    System.out.println(spendings);
                    Taxes.recommendTax(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }
}