import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int number = Base.condition(scanner, "Nhap bai toan ban muon giai");
            if (number >= 1 && number <= 9) {
                ListExe.exe(scanner, number);

            }
            System.out.println("\nBạn có muốn tiếp tục hay dừng chương trình? (Y/N)");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("N")) {
                continueProgram = false;
            }
        }
        System.out.println("Chương trình đã kết thúc.");
    }

}