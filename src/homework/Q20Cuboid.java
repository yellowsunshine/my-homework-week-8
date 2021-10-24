package homework;

import com.sun.org.apache.regexp.internal.RE;

public class Q20Cuboid extends Q20Rectangle {

    double height;

    //child class constructor
    public Q20Cuboid(double width, double length, double height) {
        super(5, 10);

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //METHOD 1
    public double getHeight (){
        return this.height;
    }

    //METHOD 2
    public double getVolume(){
        double volume = super.getArea()*this.height;
        return volume;
    }




}
