package homework;

public class Q20Rectangle {

    //fields
    double width;
    double length;

    //constructor with 2 arguments
    public Q20Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length<0){
            this.length=0;
        } else {
            this.length = length;
        }
    }

    //METHOD 1
    public double getWidth (){
        return this.width;
    }

    //METHOD 2
    public double getLength(){
        return this.length;
    }

    //METHOD 3
    public double getArea (){
        double area = this.width*this.length;
        return area;
    }
}
