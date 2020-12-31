
package OOP;

/**
 *
 * @author amitguho
 * 09.19 PM
 * 19.04.2020
 * Related with OpConstructorTest
 */
public class OpConstructor {
   String name,gender;
   int phone;

   //Constructor overloading---->>>Parameter are different types
   
   
   //default constructor
   OpConstructor() {
        System.out.println("No Value");
    }

    OpConstructor(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

     OpConstructor(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
     
     void display(){
         System.out.println(name);
         System.out.println(gender);
         System.out.println(phone);
         System.out.println("");
     }
   
   
}
