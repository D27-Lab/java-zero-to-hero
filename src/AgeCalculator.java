import java.util.Scanner; // для чтения ввода
import java.time.LocalDate; // для получения текущего года

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём сканер для ввода

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine(); // читаем имя

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt(); // читаем год рождения

        int currentYear = LocalDate.now().getYear(); // получаем текущий год
        int age = currentYear - birthYear; // вычисляем возраст

        System.out.println("Привет, " + name + "! Тебе " + age + " лет.");
    }
}
