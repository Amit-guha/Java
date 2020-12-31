
package Stack_Data;

/**
 *
 * @author amitguho
 */
public class stack {
    //Last in First Out
  int [] add=new int[5];
  int top=0;
  public void push(int data){
      add[top]=data;
      top++;
  }
  
  public int pop(){
      int data;
      top--;
      data=add[top];
      add[top]=0;
      return data;
  }
  
  public int peek(){
      int data;
      data=add[top-1];
      return data;
  }
  
  public int size(){
      return top;
  }
  
  public boolean Emtpy(){
      if(top<=0){
          return true;
      }
      else
          return false;
  }
  
  public void show(){
      for (int i : add) {
          System.out.print(i+" ");
      }
  }
}
