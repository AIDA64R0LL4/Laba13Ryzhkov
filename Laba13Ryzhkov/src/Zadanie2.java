import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк: ");
            int rows = scanner.nextInt();

            System.out.print("Введите количество столбцов: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();

            if (column < 0 || column >= cols) {
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером нет");
            }

            System.out.println("Столбец:");

            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println("Программа завершена");
        }
    }
}