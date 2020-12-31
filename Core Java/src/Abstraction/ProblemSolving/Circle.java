
package Abstraction.ProblemSolving;

/**
 *
 * @author amitguho
 */
public class Circle extends Shape {

     double r;
    public Circle(double r) {
        this.r = r;
    }
    
     @Override
   void Area(){
         System.out.println("Circle :"+Math.PI*r*r);
   }

   
    
}
