
package OOP;

/**
 *
 * @author amitguho
 * 10.35 AM
 * 23.04.2020
 */
public class Varargs {
    //Any length of parameter----->>>>Variable length Argument
    void Addition(int ... number){//Formal parameter
        int sum=0;
        for (int i : number) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Varargs ob=new Varargs();
        ob.Addition(10);//Actual Parameter
        ob.Addition(10,20);
        ob.Addition(10,10,10);
    }
    
}
