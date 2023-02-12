import java.util.Scanner;

public class RunProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager danhSach1 = new ProductManager();
        int luaChon = 0;
        do {
            System.out.println("Menu");
            System.out.println("Vui long chon chuc nang");
            System.out.println(" " +
                    "1, Them san pham." +
                    "2, Hien thi danh sach sinh vien" +
                    "3, Xoa san pham" +
                    "0, Thoat");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("nhap ten san pham");
                String tenSanPham = sc.nextLine();
                System.out.println("nhap ma san pham");
                int maSanPham = sc.nextInt();
                System.out.println("nhap gia san pham");
                int giaSanPham = sc.nextInt();
                Product sp1 = new Product(tenSanPham, maSanPham, giaSanPham);
                danhSach1.themSanPham(sp1);
            } else if (luaChon == 2) {
              danhSach1.toString();
            } else if (luaChon == 3) {

            } else if (luaChon == 4) {

            }
        }
            while (luaChon!=0);
        }
    }

