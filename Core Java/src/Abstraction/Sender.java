
package Abstraction;

/**
 *
 * @author amitguho
 */
public class Sender extends WhatsApp {
    
    
    //When use the abstract method or class,it must be overridden
    @Override
    void sendMessage(){
        System.out.println("Hi ! How are you ?");
    }
}
