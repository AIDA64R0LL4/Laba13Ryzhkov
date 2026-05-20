import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            byte[] array = new byte[size];

            System.out.println("Введите элементы массива типа byte:");

            for (int i = 0; i < size; i++) {
                int value = scanner.nextInt();

                if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Число выходит за границы типа byte");
                }

                array[i] = (byte) value;
            }

            int sum = 0;

            for (byte num : array) {
                sum += num;
            }

            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Сумма выходит за границы типа byte");
            }

            System.out.println("Сумма элементов: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println("Программа завершена");
        }
    }
}
