package bai2;

public class Poin2D {
    private float x=0.0f;
    private  float y=0.0f;
    public Poin2D(){
    }
    public Poin2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] setXY(float x,float y){

        return new float[]{x, y};
    }
    public String toSstring(){
        return "x: is "+getX()+"y: is "+getY();
    }

}
