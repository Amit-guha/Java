
package OOP;

/**
 *
 * @author amitguho
 * 10.08 PM
 * 19.04.2020
 */
public class Static {
    String name,gender;
    static String universityName="BSMRSTU";//static ---->>>>Memory Management
    
    Static(String n,String g){
        name=n;
        gender=g;
    }
    
    void show(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(universityName);
    }
    
    //static member or variable has no relation with Object;it relates with class
    
    public static void main(String[] args) {
        Static ob=new Static("Amit","Male");
        ob.show();
        
        System.out.println("");
       
       // System.out.println(Static.universityName);
    }
    
    
}
