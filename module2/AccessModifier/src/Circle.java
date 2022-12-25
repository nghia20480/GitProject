public class Circle {
    private double radius=1.0;
    private String color="Red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public  void setRadius(double radius){
        this.radius=radius;
    }
    public double area(){
        return this.radius*this.radius*3.14;
    }

    public static void main(String[] args) {
        Circle cir1=new Circle(2);
        System.out.println(cir1.area());
    }
}
