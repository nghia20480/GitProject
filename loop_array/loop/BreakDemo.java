package loop;

public class BreakDemo {
    public static void main(String[] args) {
        loop:
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = i + 1; j < 5; j++) {
                if (j == 2) {
                    break loop;
                }
                System.out.println("j = " + j);
            }
        }
    }
}
