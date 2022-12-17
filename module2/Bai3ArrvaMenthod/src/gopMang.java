import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        System.out.println("Vui long nhap do dai mang  1: ");
        Scanner scanner = new Scanner(System.in);
        int inputLength1 = scanner.nextInt();
        int[] array1 = new int[inputLength1];
        for (int i = 0; i < inputLength1; i++) {
            System.out.println("Vui long nhap phan tu cua mang  1: ");
            Scanner scanner1 = new Scanner(System.in);
            int value1 = scanner.nextInt();
            array1[i] = value1;
        }
        System.out.println("Vui long nhap do dai mang  2: ");
        Scanner scanner2 = new Scanner(System.in);
        int inputLength2 = scanner.nextInt();
        int[] array2 = new int[inputLength2];
        for (int i = 0; i < inputLength2; i++) {
            System.out.println("Vui long nhap phan tu cua mang  2: ");
            Scanner scanner1 = new Scanner(System.in);
            int value2 = scanner.nextInt();
            array2[i] = value2;
        }
        for (int i = 0; i < inputLength1; i++) {
            System.out.println(array1[i]);
        } for (int i = 0; i < inputLength2; i++) {
            System.out.println(array2[i]);
        }
        int[] array3=new int[array1.length+array2.length];
        for (int i = 0; i < inputLength1; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i <array2.length ; i++) {
            array3[array1.length+i]=array2[i];
        }
        System.out.println("Mang sau khi dc gop la: ");
        for (int i = 0; i < array3.length ; i++) {
            System.out.println(array3[i]);
        }
    }

}
