import java.util.Scanner;

public class Task01 {

    public static float getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            float input = 0.0f;
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Введите дробное (float) число: ");
                    input = scanner.nextFloat();
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Неверный тип данных!");
                    scanner.nextLine();
                }
            }

            return input;
        }
    }

    public static void main(String[] args) {
        float userInput = getUserInput();
        System.out.println("Успешный ввод: " + userInput);
    }
}
