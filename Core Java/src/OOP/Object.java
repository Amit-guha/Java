
package OOP;

/**
 *
 * @author amitguho
 * 11:56 PM
 * 17.04.2020
 */
public class Object {
    public static void main(String[] args) {
        Student student=new Student();//object Create..
        student.name="Amit guha";
        student.Gender="Male";
        student.phone=999;
        student.call();//method call from the Student class
        
        System.out.println("After Method Call...");
        System.out.println(student.name);
        System.out.println(student.Gender);
        System.out.println(student.phone);
    }
}
