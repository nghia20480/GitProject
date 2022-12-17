package loop;

import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
//        for (int i = 2; i <= 20; i += 2) {
//            System.out.print(i + "  ");
//        }
//        int n = 2;
//        while (n <= 20) {
//            System.out.print(n + "  ");
//            n += 2;
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập m:");
        int m = scanner.nextInt();
//        while (m != 0) {
//            System.out.println("Nhập m (dừng khi m = 0): ");
//            m = scanner.nextInt();
//        }

        for (;m != 0;m = scanner.nextInt()) {
            System.out.println("Nhập m (dừng khi m = 0): ");
        }

        for(;;) {
            // statement
        }
    }
}
