
package OOP;

/**
 *
 * @author amitguho
 * 1:55 AM
 * 30.04.2020
 */
public class TOSTRING {
    String name,age;

    public TOSTRING(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name : "+name+"\n"+"Age : "+age;
    }
    
    public static void main(String[] args) {
        TOSTRING ob=new TOSTRING("Amit","23");
        System.out.println(ob);
    }
}
