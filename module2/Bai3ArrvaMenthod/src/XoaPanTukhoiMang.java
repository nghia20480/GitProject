import java.util.Scanner;

public class XoaPanTukhoiMang {
    public static void main(String[] args) {
        System.out.println("Vui long nhap do dai mang: ");
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        Double[] array1 = new Double[inputLength];
        for (int i = 0; i < inputLength; i++) {
            System.out.println("Vui long nhap phan tu cuau mang: ");
            Scanner scanner1 = new Scanner(System.in);
            Double value = scanner.nextDouble();
            array1[i] = value;
        }
        for (int i = 0; i < inputLength; i++) {
            System.out.print(array1[i] + ' ');
        }
        System.out.println("");
        System.out.println("Vui long nhap phan tu can xoa");
        Scanner scanner2 = new Scanner(System.in);
        double delValue = scanner.nextDouble();
        for (int i = 0; i < inputLength; i++) {
            if (array1[i] == delValue) {
                if (i == inputLength - 1) {
                    array1[i] = 0.0;
                } else {
                    for (int j = i; j < inputLength; j++) {
                        if (j == inputLength - 1) {
                            array1[j] = 0.0;
                        } else {
                            array1[j] = array1[j + 1];
                        }
                    }
                }
            }
        }
        for (int i = 0; i <inputLength ; i++) {
            System.out.println(array1[i]);
        }
    }
}
