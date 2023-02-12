package phuong_thuc_insert_sort;

public class insertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
    public static void printlist(int[] list){
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i]+" ");
        }
    }

    public static void main(String[] args) {
         int[] list={4,2,56,7};
        insertionSort(list);
        System.out.println("List sau khi duoc sap xep: ");
        printlist(list);

    }
}
