
package Method_Overridding;

/**
 *
 * @author amitguho
 * 1:10 AM
 * 26.04.2020
 */
public class Teacher extends Student {
    String Qualification;
    
    @Override
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+Qualification);
    }
}
