
package LinkedList_Implementaiton;

/**
 *
 * @author amitguho
 */
public class Main {
    public static void main(String[] args) {
        linklist list=new linklist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertStartAt(33);
        list.insertMiddle(0, 24);
        list.delete(2);
        list.show();
    }
    
}
