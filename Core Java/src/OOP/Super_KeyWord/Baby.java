
package OOP.Super_KeyWord;

/**
 *
 * @author amitguho
 * 12:48 PM
 * 26.04.2020
 */
public class Baby extends Man{
    int Weight;
    Baby(String n,String c,int w){
        super(n,c);
        Weight=w;
    }
    
    @Override
     void show(){
        System.out.println(name);
        System.out.println(Color);
        System.out.println(Weight);
    }
    
    
    
    
}
