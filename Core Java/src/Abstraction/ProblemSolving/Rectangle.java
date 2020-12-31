
package Abstraction.ProblemSolving;

/**
 *
 * @author amitg
 */
public class Rectangle extends Shape {
    double height,width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    @Override
    void Area(){
        System.out.println("Rectangle : "+height*width);
    }
}
