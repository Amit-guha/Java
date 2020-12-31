package OOP;

/**
 *
 * @author amitguho 10:43 AM 23.04.2020
 * Factorial using Recursion
 */
public class RecursionFactorial {

    int fact(int n) {
        if (n == 1) {
            return 1;
        } 
        else if(n==0){
            return 1;
        }
        
        else {
            return n * fact(n - 1);
        }

    }
    
    public static void main(String[] args) {
        RecursionFactorial b=new RecursionFactorial();
       int a= b.fact(0);
        System.out.println(a);
    }

}
