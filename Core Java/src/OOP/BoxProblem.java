
package OOP;

/**
 *
 * @author amitguho
 * 08.50 PM
 * 21.04.2020
 */
public class BoxProblem {
    double height,width,depth;//-------------->>>Instance Variable

    
    //hiding instance Variable
    BoxProblem(double height, double width, double depth) {
        this.height = height;//this.instance Variable--->>>Local Variable
        this.width = width;
        this.depth = depth;
    }
    
    void display(){
        double volume=width*height*depth;
        System.out.println(volume);
    }
    
    public static void main(String[] args) {
        BoxProblem b=new BoxProblem(10,10,10);
        BoxProblem b1=new BoxProblem(20,30,10);
        
        b.display();
        b1.display();
    }
    
    
    
}
