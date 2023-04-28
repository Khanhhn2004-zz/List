import java.util.ArrayList;
import java.util.Scanner;

public class Base {
    // enterIntenger nhập số nguyên
    public static int enterIntenger(Scanner scanner, String chain) {
        System.out.println(chain);
        return scanner.nextInt();
    }

    // condition điều kiện sai
    public static int condition(Scanner scanner, String chain) {
        int n;
        do {
            n = enterIntenger(scanner, chain);
            if (n < -0)
                System.out.println("the number just entered is not a positive integer that invites you to re-enter");
        } while (n < -0);
        return n;
    }

    // realNumber nhập số thực
    public static float realNumber(Scanner scanner, String chain) {
        System.out.println(chain);
        return scanner.nextFloat();
    }

    //alphabet kí tự chũ
    public static String alphabet(Scanner scanner, String chain) {
        System.out.println(chain);
        return scanner.next();
    }

    //multiply nhân
    public static int multiply(int n) {
        int product = 1;
        for (int i = 1; i <= n ; i++) {
            product *= i;
        }
        return product;
    }

    //sum tổng
    public static int sum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n)
            sum += i++;
        return sum;
    }

    //intenger nhập số nguyên dường
    public static int intenger(Scanner scanner, String str) {
        return Base.condition(scanner, str + ": ");
    }

    //unicode nhập các kí tự từ bàn phím
    public static String unicode(Scanner scanner, String str) {
        return Base.alphabet(scanner,  str + ": ");
    }

    //printOut in ra
    public static void printOut(String str) {
        System.out.println(str);
    }

    //Mảng số thực
    public static double[] realNumberAray(Scanner scanner) {
        int x = Base.condition(scanner, "please enter the number of elements of the array");
        double[] arr = new double[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value index " + (i ) + " :");
            arr[i] = scanner.nextInt();
        }
        for (double v : arr) {
            System.out.println(v + "  ");
        }
        return arr;

    }

    //Mảng số nguyên dương
    public static int[] intengerAray(Scanner scanner) {

        int x;
        do {
            x = enterIntenger(scanner,"Please enter the number of elements you want(1 < limit < [10] )");
            if (x < 1|| x>9)
                System.out.println("the number of elements exceeds the array, please re-enter");
        } while (x < 1||x>9);
        int[] b = new int[10];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter value index " + (i) + " :");
            b[i] = scanner.nextInt();
        }
        return b;
    }
    public static int[] intengerArayy(Scanner scanner) {
        int x = Base.condition(scanner, "please enter the number of elements of the array");
        int[] b = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter value index " + (i) + " :");
            b[i] = scanner.nextInt();
        }
        return b;
    }
    public static void printArray(int [] a) {
        for (int j : a) {
            System.out.print(j + "   ");
        }
    }
    public static ArrayList<Integer> arrayList(Scanner scanner) {
        int n =Base.condition(scanner,"mooi ban nhap x");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i) + " :");
            Integer x = scanner.nextInt();
            arr.add(x);
        }
        return arr;
    }
    public static ArrayList<Double> arrayList2(Scanner scanner) {
        int n =Base.condition(scanner,"moi ban nhap x");
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i) + " :");
            Double x = scanner.nextDouble();
            arr.add(x);
        }
        return arr;
    }
}
