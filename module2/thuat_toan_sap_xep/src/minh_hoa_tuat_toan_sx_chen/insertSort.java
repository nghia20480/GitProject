package minh_hoa_tuat_toan_sx_chen;

public class insertSort {

    public void insertionSort() {
        int[] arr={4,3,6,1,2};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println(arr[j-1]);
                } else {
                    break;
                }
            }
        }



        }


    public static void main(String[] args) {
        insertSort sx=new insertSort();


    }


}
