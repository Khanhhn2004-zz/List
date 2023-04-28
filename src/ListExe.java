import java.util.Scanner;

public class ListExe {
    public static void exe(Scanner scanner, int number) {
        String result = "Ket qua: ";
        switch (number) {
            case 1:
                Base.printArray(insertionSort(Base.intengerArayy(scanner)));
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
