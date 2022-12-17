public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh hien thi cac so nguyen to nho hon 100");
        for (int i = 2; i<100 ; i++) {
            int count1=0;
            for (int j = 1; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    count1++;
                }
            } if (count1==2){
                System.out.println(i);

            }
        }

    }
}
