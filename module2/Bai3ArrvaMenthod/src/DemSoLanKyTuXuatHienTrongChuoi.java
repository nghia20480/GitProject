import java.util.Scanner;

public class DemSoLanKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        String chuoi="abcdde";
        int dem=0;
        char kiemTra;
        System.out.println("Vui long nhap ky tu can kiem tra: ");
        Scanner scanner= new Scanner(System.in);
        kiemTra=scanner.next().charAt(0);
        for (int i = 0; i <chuoi.length() ; i++) {
            if (kiemTra==chuoi.charAt(i)){
                dem++;
            }
        } System.out.println("So lan xuat hien cua ky tu "+kiemTra+" la: "+dem);

    }
}
