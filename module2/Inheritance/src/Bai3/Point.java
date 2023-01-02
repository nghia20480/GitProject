package Bai3;

public class Point {
     float x;
     float y;
    public Point(){

    };
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float[] a){
        this.x=a[0];
        this.y=a[1];
    }
    public float getXY(){
        return 2;
    }
    public String toString(){
        return "Gia tri X la: "+x+", gia tri y la: "+y;
    }

}
