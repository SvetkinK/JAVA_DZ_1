import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ_1 {
  public static void main(String[] args) {
  // public static void HomeWork1(){
// Задача_1  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
      // System.out.println("Задание номер 1");
      // System.out.printf("Введите число n: "); 
      //   Scanner num = new Scanner(System.in);
      //   int n = num.nextInt();
      //   int sum = 0;
      //   int mult = 1;
      //   for (int i = 1; i <= n; i++) {
      //       sum += i;
      //       mult *= i;            
      //   }
      //   System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
      //   System.out.printf("Произведение чисел от 1 до %d: %d%n", n, mult);
      //   num.close();
// Задача_2 Вывести все простые числа от 1 до 1000
      System.out.println("Задание номер 2");
      Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
// Задача_3 Реализовать простой калькулятор
      // System.out.println("Задание номер 3");
      // Scanner sc = new Scanner(System.in);
      //   System.out.print("Введите первое число: ");
      //   int numb_a = sc.nextInt();
      //   System.out.print("Введите второе число: ");
      //   int numb_b = sc.nextInt();
      //   System.out.println("Введите операцию + - / *: ");
      //   char operation;
      //   operation = sc.next().charAt(0);
      //   int res;
      //   switch (operation) {
      //       case '+':
      //           res = numb_a + numb_b;
      //           System.out.printf("Результат: %d",res);
      //           break;
      //       case '-':
      //           res = numb_a - numb_b;
      //           System.out.printf("Результат: %d",res);
      //           break;
      //       case '/':
      //           res = numb_a / numb_b;
      //           System.out.printf("Результат: %d",res);
      //           break;
      //       case '*':
      //           res = numb_a * numb_b;
      //           System.out.printf("Результат: %d",res);
      //           break;

      //   }
      //   sc.close();
     }
}

// public class seminar_2
// {
//     public static void HomeWork1(){
//        System.out.println("Задание номер 1"); 
//     }
//     public static void HomeWork2(){
//         System.out.println("Задание номер 2");
//     }
//     public static void HomeWork3(){
//         System.out.println("Задание номер 3");
//     }
// 	public static void main(String[] args) {
// 		HomeWork1();
// 		HomeWork2();
// 		HomeWork3();
// 	}
// }