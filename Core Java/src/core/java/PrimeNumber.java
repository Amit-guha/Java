
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int n,m;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        m=input.nextInt();
        int count=0;
        for (int i = n; i <=m; i++) {
            
            for (int j = 2; j <i; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
               
            }
             if(count==0){
                    System.out.print(i+" ");
                }
            count=0;
        }
        
        
    }
    
}
