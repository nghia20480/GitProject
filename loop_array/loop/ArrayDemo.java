package loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
