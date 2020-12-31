
package Abstraction;

/**
 *
 * @author amitguho
 */
public class Receiver extends WhatsApp {

   //When use the abstract method or class,it must be overridden
     @Override
    void sendMessage(){
        System.out.println("Hi ! I am fine. you?");
    }
}
