import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi ban nhap so tien usd: ");
        usd=sc.nextDouble();
        double quydoi=usd*23000;
        System.out.print("Gia tri VND: "+quydoi);

    }
}
