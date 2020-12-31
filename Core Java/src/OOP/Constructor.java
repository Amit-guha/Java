
package OOP;

/**
 *
 * @author amitguho
 * 1:11 AM
 * 18.04.2020
 */
public class Constructor {
    String name,gender;
    int age;
    
    Constructor(){//default constructor
        System.out.println("No Value");
    }
    
    
    Constructor(String n,String g,int a){
     //Constructor is a special type of method
        name=n;
        gender=g;
        age=a;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println("\n");
    }
    
}
