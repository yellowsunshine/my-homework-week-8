package homework;

public class Q19Cylinder extends Q19Circle{

    double height;

    //Constructor
    Q19Cylinder(double radius, double height){
        super(5.55);
        if (height<0){
            this.height =0.0 ;
        }else {
            this.height = height;
        }
    }

    //instance method 1
    public double getHeight (){
        return this.height;
    }

    public double getVolume (){
        double volume = super.getArea()*this.height;
        return volume;
    }
}


