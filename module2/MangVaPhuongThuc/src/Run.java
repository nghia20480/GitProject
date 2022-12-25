import java.sql.SQLOutput;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Width: ");
        double width= scanner.nextDouble();
        System.out.println("Enter the Height: ");
        double height=scanner.nextDouble();
    Rectange rectange=new Rectange(width, height);
        System.out.println("Your Rectange \n"+ rectange.display());
        System.out.println("Predimeter of the Rectange: "+rectange.getPerimeter());
        System.out.println("Area og the Rectange: "+rectange.getArea());
    }
}
