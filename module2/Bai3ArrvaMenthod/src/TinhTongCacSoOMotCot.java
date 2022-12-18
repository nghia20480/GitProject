import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {

        int soDong, soCot;
        int tong = 0;
        int cot;


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner1.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner1.nextInt();
        int[][] A = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner1.nextInt();
            }
        }
        System.out.println("Vui long nhap so hang cua cot can tinh toan: ");
        Scanner scanner = new Scanner(System.in);
        cot = scanner.nextInt();
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (j == cot) {
                    tong = tong + A[i][j];
                }
            }
        }
        System.out.println(tong);
    }
}
