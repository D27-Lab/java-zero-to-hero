import java.util.Scanner;

public class IsAdultChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Привет, " + name + "! Ты совершеннолетний.");
        } else {
            System.out.println("Привет, " + name + "! Ты НЕсовершеннолетний.");
        }
    }
}
