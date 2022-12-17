import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,0,0};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
            System.out.println("Nhap vi tri ban can them vao mang: ");
            Scanner scanner=new Scanner(System.in);
            int index= scanner.nextInt();
            System.out.println("Nhap gia tri ban can them: ");
            Scanner scanner1=new Scanner(System.in);
            int value=scanner1.nextInt();
            if (index>=0&&index<=arr.length-1){
                for (int i = arr.length-1; i >index ; i--) {
                    arr[i]=arr[i-1];
                }
                arr[index]=value;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
