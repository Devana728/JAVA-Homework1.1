//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");

        System.out.printf("Введите число N:  ");

        int n = Integer.valueOf(scanner.nextLine().trim());
        scanner.close();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            mult = mult * i;

        }
        System.out.println(" Сумма чисел от 1 до N = "+ sum);
        System.out.printf(" Произведение чисел от 1 до N = %s", mult);
    }
}
