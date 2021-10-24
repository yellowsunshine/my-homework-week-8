package homework;

public class Q19Circle {
    double radius;


    //constructor 1 parameter
    Q19Circle(double radius) {

        //if radius is less than 0 it needs to set it as 0
        if (radius < 0) {
            this.radius = radius = 0.0;
        } else {
            this.radius = radius;
        }
    }

    //Instance Method 1
    public double getRadius() {
        return radius;
    }

    //Method 2
    public double getArea(){
        double area = this.radius*this.radius*Math.PI;
        return area;
    }

}



