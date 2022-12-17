import java.util.Scanner;

public class HienThiSonguyenTo {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so luong so nguyen to can in ra: ");
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();
        int count1=0;

        for (int i = 2; count1<input ; i++) {
            int count2=0;
            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    count2++;
                }
            } if (count2==2){
                System.out.println(i);
                count1++;
            }
        }
    }
}
