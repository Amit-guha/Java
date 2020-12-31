
package OOP;

/**
 *
 * @author amitguho
 * 12:21 AM
 * 18.04.2020
 */
public class ParameterizedMethod {
    String name,Gender;
    int age;
    
    void set(String n,String g,int a){
        name=n;
        Gender=g;
        age=a;
    }
    
    void show(){
        System.out.println(name);
        System.out.println(Gender);
        System.out.println(age);
    }
    
}
