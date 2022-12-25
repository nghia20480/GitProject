package Bai1;

public class Circle {
    private String Color;
    private int Radius;
    public int getRadius(){
        return Radius;
    }
    public void setRadius(){
        this.Radius=Radius;
    }
    public String getColor(){
        return Color;
    }
    public void setColor() {
        this.Color = Color;
    }
    public Circle(){
    }
    public Circle(int Radius,String Color){
        this.Radius=Radius;
        this.Color=Color;
    }
    public double Area(){
        return Radius*Radius*3.14;
    }
    public String ToString(){
        return "Circle R:="+Radius+"Color="+Color;
    }
}
