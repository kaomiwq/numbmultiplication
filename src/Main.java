import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int count  = 0;
        System.out.print("Введите колличество чисел: ");
        count = scanner.nextInt();

        int[] numb = new int[count];
        for (int i = 0; i < numb.length; i++) {
            System.out.print(String.format("Значение %d числа : ", i + 1, count));
            numb[i] = random.nextInt(10 - 5 + 1 ) + 5;
            System.out.println(numb[i]);
        }
        for (int i = 0; i < numb.length; i++) {
            System.out.print(String.format("Значение %d числа увеличенное в два раза:  ", i + 1, count));
            numb[i] = numb[i] * 2;
            System.out.println(numb[i]);
        }
    }
}