import java.io.IOException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int number = in.nextInt();
        switch (number) {
            case (1) -> System.out.printf("Задание %d еще не готово", number);
            case (2) -> Task002.main(args);
            case (3) -> Task003.main(args);
            case (4) -> Task004.main(args);
            case (5) -> System.out.printf("Задание %d еще не готово", number);
            case (6) -> System.out.printf("Задание %d еще не готово", number);
            case (7) -> Task007.main(args);
            case (8) -> {
                System.out.println("Частный случай для доски 5*5 - не работает, универсальное решение готово");
                Task008.main(args);
            }
            case (9) -> Task009.main(args);
            case (10) -> System.out.printf("Задание %d еще не готово", number);
            case (11) -> System.out.printf("Задание %d еще не готово", number);
            case (12) -> System.out.printf("Задание %d еще не готово", number);
            case (13) -> System.out.printf("Задание %d еще не готово", number);
            default -> System.out.println("Такого задания нет");
        }
    }
}
