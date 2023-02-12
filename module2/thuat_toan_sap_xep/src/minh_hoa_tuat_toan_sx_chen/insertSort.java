package minh_hoa_tuat_toan_sx_chen;

public class insertSort {

    public static void main(String[] args) {
        int[] arr={4,7,3,5};
        System.out.println("Chuoi truoc khi duoc sap xep");
        for (int l = 0; l < arr.length ; l++) {
            System.out.print(arr[l]+" ");}
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("");
                System.out.println("so sanh phan tu thu :"+i+" la "+arr[j-1]+" va "+arr[j]);
                if (arr[j] < arr[j - 1]) {
                    System.out.println("vi "+arr[j]+" be hon "+arr[j-1]+" nen "+ "Doi cho "+arr[j]+" va "+arr[j-1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.print("Thu tu phan tu cua mang sau lan sap xep nay la: ");
                    for (int k = 0; k < arr.length ; k++) {
                        System.out.print(arr[k]+" ");
                    }

                } else {
                    System.out.println("khong co su hoan doi nao duoc thuc hien");
                    break;
                }
            }
        }
        System.out.println("Mang sau khi duoc sap xep la: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }










}
