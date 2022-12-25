public class Rectange {
    double width, height;
    public  Rectange(){
    }
    public  Rectange(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public  double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public  String display(){
        return "Rectange{"+"width="+width+",height"+height+"}";
    }
}
