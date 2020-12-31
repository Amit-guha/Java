
package OOP;

/**
 *
 * @author amitguho
 * 09.33 PM
 * 21.04.2020
 */
public class MethodOverloading {
    void add(){
        System.out.println("No Parameter");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.add(10.0, 1);
    }
}
