
package PolyMorphism;

/**
 *
 * @author amitguho
 * 10:26 PM
 * 
 */
public class Triangle extends Area {

  double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
  
  @Override
     double area(){
        return 0.5*base*height;
    }
    
}
