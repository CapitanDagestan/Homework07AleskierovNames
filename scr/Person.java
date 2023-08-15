import java.util.Random;
import java.util.Scanner;

public class Person {

    public static Object personInfo(String name, String town, int number) {
        System.out.println("Зателефонувати громадянину " + name + " із міста " + town + " можна за номером: " + number);
        return null;
    }

    public static Object personNew() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int id = random.nextInt(2312323);
        System.out.println("Введіть ім`я: ");
        String name = scanner.nextLine();
        System.out.println("Введіть місто проживання: ");
        String town = scanner.nextLine();
        System.out.println("Введіть ваш вік: ");
        int age = scanner.nextInt();
        System.out.println("Введіть ваш дійсний номер: ");
        int number = scanner.nextInt();
        if (age < 18) {
            System.out.println("Потрібен дозвіл батьків для реєстрації");
        } else {
            System.out.println("Нового користувача " + "\"" + name + "\"" + " зареєстровано");
            System.out.println("ID користувача: " + id);
            personInfo(name, town, number);
        }
        return null;
    }
}
