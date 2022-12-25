package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void getRoot1(){
        if (a == 0) {
            System.out.println("Day la phuong trinh bac 1!");
            if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem!");
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat: " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * (a * c);
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet!");
                System.out.println("x1: " + (-b + Math.sqrt(delta)) / 2 * a);
                System.out.println("x2: " + (-b - Math.sqrt(delta)) / 2 * a);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep!");
                System.out.println("x1 = x2 : " + (-b / (2 * a)));
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
    }



    }
     class Runbai1{
        public static void main(String[] args) {
            double a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("vui long nhap a");
             a= sc.nextDouble();

            System.out.println("vui long nhap b");
             b= sc.nextDouble();

            System.out.println("vui long nhap c");
             c= sc.nextDouble();
            QuadraticEquation quaratic=new QuadraticEquation(a,b,c);
            quaratic.getRoot1();
        }
    }


