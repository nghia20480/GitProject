import java.util.Scanner;
public class VongLapTongJaVa {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1: In hinh tam giac vuong.");
        System.out.println("2: In hinh chu nhat.");

        Scanner scanner = new Scanner(System.in);
        int inPut;
        inPut = scanner.nextInt();
        if (inPut == 1) {
            System.out.println("Vui long nhap chieu cao:");
            int heightRec=scanner.nextInt();
            for (int i = 1; i <= heightRec; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print('*');


                }
                System.out.println(" ");
            }
        } else if (inPut==2) {
            System.out.println("Vui long nhap chieu cao:");
            int heightSq= scanner.nextInt();
            System.out.println("Vui long nhap chieu rong:");
            int wildSq= scanner.nextInt();
            for (int k=1;k<=heightSq;k++){
                for (int q=1;q<=wildSq;q++){
                    System.out.print('*');
                }
                System.out.println(" ");
            }
        }
        }

    }



