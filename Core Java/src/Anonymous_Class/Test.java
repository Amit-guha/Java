
package Anonymous_Class;

/**
 *
 * @author amitguho
 * 
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person(){
            //Run time---->>>Method Overriding
            @Override
            void display(){
                System.out.println("Anonymous class");
            }
        };
        p.display();
    }
}
