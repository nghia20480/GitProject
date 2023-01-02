package Bai3;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    };
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr=new float[2];
        arr[0]=this.xSpeed;
        arr[1]=this.ySpeed;
        return arr;
    }
    @Override
    public String toString(){
        return  "MovablePoint"+
                " xSpeed: "+xSpeed
                +" ySpeed: "+ySpeed
                +" x= "+ x
                +" y= "+ y;
    }
    public MovablePoint move(){
        super.setX(super.getX()+this.xSpeed);
        super.setY(super.getY()+this.ySpeed);
        return this;

    }

}
