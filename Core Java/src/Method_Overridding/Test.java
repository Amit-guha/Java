
package Method_Overridding;

/**
 *
 * @author amitguho
 * 1:13 AM
 * 26.04.2020
 */
public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="Md.Jamal Uddin";
        t.age="35";
        t.Qualification="Assistant Professor";
        t.show();
        
        
        Student s=new Student();
        s.name="Amit guha";
        s.age="23";
        s.show();
    }
    
}
