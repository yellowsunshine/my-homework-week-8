package homework;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;

public class Q19Main {

    public static void main(String[] args) {
        Q19Circle circle = new Q19Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Q19Cylinder cylinder = new Q19Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
