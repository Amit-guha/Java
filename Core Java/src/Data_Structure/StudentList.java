
package Data_Structure;

import java.util.LinkedList;

/**
 *
 * @author amitguho
 * 09:15 PM
 * 30.04.2020
 */
public class StudentList {
    int id;
    String name;
    static String className="Ten";

    public StudentList(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {
        LinkedList<StudentList>student=new LinkedList<>();
        StudentList s1=new StudentList(1,"Amit");
        StudentList s2=new StudentList(2,"b");
        StudentList s3=new StudentList(3,"c");
        StudentList s4=new StudentList(4,"d");
        StudentList s5=new StudentList(5,"e");
        
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
      
        for (StudentList studentList : student) {
            System.out.println(studentList.id+" "+studentList.name+" "+StudentList.className);
        }
               
    }
}
