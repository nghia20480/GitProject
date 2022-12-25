package bai3Fan;

public class Fan {
    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int Speed;
    private boolean on;
    private double Radius;
    private String Color;

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public Fan() {
        this.Speed = Slow;
        this.on = on;
        this.Radius = 5;
        this.Color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.Speed = speed;
        this.on = on;
        this.Radius = radius;
        this.Color = color;
    }

    public String toString() {
        if (on == true) {
            return "Speed:" + this.getSpeed() + ",Radius:" + this.getRadius() + "Color:" + this.getColor() + "Fan is on";
        } else {
            return "Speed:" + this.getSpeed() + ",Radius:" + this.getRadius() + "Color:" + this.getColor() + "Fan is off";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "Yellow");
        Fan fan2 = new Fan(2, false, 5, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}




