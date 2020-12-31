
package OOP;

/**
 *
 * @author amitguho
 * 12.10 AM
 * 20.04.2020
 */
public class StaticMethod {
   static int b=10;
    
    //non static method access the static method or variable
    void show(){
        //display();
        System.out.println("Non static method");
    }
    
    
    //static method can not access the non static method or variable
    static void display(){
        System.out.println(b);
            System.out.println("Static Method");
    }
    
    public static void main(String[] args) {
        StaticMethod.display();
    }
}
