package OOP;

/**
 *
 * @author amitguho 11:55 PM 23.04.2020
 */
public class Encapsulation {

    private String name;
    private int id;
    
    //Acces Modifier -->> private
    //if the access modifier is private,then use the setter and getter method to set and get the data

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   /* void display(){
        System.out.println(name);
    }
*/

}
