
package Queue;

/**
 *
 * @author amitguho
 */
public class main {
    public static void main(String[] args) {
        queue q=new queue();
        q.Enqueue(5);
        q.Enqueue(10);
        q.Enqueue(15);
     
        
        q.Enqueue(20);
        q.Enqueue(21);
        
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
       
        
        q.Enqueue(22);
        q.Enqueue(23);
        q.Enqueue(24);
        q.Enqueue(25);
        q.Enqueue(26);
        
        q.show();
    }
    
}
