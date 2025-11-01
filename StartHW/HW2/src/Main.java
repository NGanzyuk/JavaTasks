import java.util.Scanner;

import static ru.netology.service.CustomsService.calculateCustoms;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();
        scanner.close();
        System.out.print("Размер пошлины (в руб.) составит: " + calculateCustoms(price, weight));
    }
}
