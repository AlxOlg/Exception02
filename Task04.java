import java.util.Scanner;

class EmptyInputException extends Exception {
}

public class Task04 {
    public static String getUserInput() throws EmptyInputException {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите текст: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new EmptyInputException();
                }

                return input;
            }
        }

    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            System.out.println("Успешный ввод: " + userInput);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: Пустая строка.");
        }
    }
}