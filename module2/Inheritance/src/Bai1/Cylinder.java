package Bai1;

public class Cylinder extends Circle{
    private int Height;
    public int getHeight(){
        return Height;
    }
    public void setHeight(){
        this.Height=Height;
    }
    public Cylinder(){
    }
    public Cylinder(int Radius,String Color,int Height){
        super(Radius,Color);
        this.Height=Height;
    }
    public double VolCylinder(){
        return super.Area()*this.Height;
    }

    public String toString(){
        return super.ToString()+"Cylinder Height:"+getHeight();
    }
}
