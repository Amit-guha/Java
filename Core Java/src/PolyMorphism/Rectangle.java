
package PolyMorphism;

/**
 *
 * @author amitguho
 */
public class Rectangle extends Area {
    double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
   
    
     @Override
     double area(){
        return length*width;
    }
}
