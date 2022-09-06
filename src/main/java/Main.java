import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Операции над double/float\n1.Сравнить\n2.Округлить\n3.Отбросить дробную часть\n");
            Integer operation = scanner.nextInt();
            if ("end".equals(operation.toString())) {
                System.out.println("Программа завершена!");
                break;
            } else {
                switch (operation) {
                    case 1:
                        System.out.println("Введите первое число : ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Введите второе число : ");
                        double num2 = scanner.nextDouble();
                        compare(num1, num2);
                        break;
                    case 2:
                        System.out.println("Введите число : ");
                        double roundedNum = scanner.nextDouble();
                        round(roundedNum);
                        break;
                    case 3:
                        System.out.println("Введите число : ");
                        double numWithoutFractionalPart = scanner.nextDouble();
                        discardFractionalPart(numWithoutFractionalPart);
                        break;
                    default:
                        System.out.println("Вы ввели неправильную операцию!");
                }
            }
            System.out.println("\n");
        }
    }

    public static double compare (double num1, double num2) {
        double diff = num1 - num2;
        if (diff > 0) {
            System.out.println(num1 + " больше " + num2);
        } else if (diff < 0) {
            System.out.println(num1 + " меньше " + num2);
        } else {
            System.out.println(num1 + " равно " + num2);
        }
        return diff;
    }

    public static double round (double num) {
        System.out.println("Введённое число после округления : " + Math.round(num));
        return Math.round(num);
    }

    public static long discardFractionalPart (double num) {
        long numWithoutFractionalPart = (long)num;
        System.out.println("Введённое число после отброса дробной части : " + numWithoutFractionalPart);
        return numWithoutFractionalPart;
    }
}
