
package Abstraction;

/**
 *
 * @author amitguho
 */
public class Message {
    public static void main(String[] args) {
        WhatsApp w;//Create Reference Variable,does not create object because it's an abstraction class and method
        w=new Sender();
        w.sendMessage();
        
        w=new Receiver();
        w.sendMessage();
    }
}
