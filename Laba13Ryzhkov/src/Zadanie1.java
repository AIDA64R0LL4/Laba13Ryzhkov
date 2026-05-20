import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            int count = 0;

            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Положительные элементы отсутствуют");
            }

            double average = (double) sum / count;

            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println("Программа завершена");
        }
    }
}
