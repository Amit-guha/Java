package Queue;

/**
 *
 * @author amitguho 08:21 PM 04.07.2020
 */
//FIFO=First in First OUT
public class queue {

    int[] arr = new int[5];
    int size;
    int front;
    int rear;

    public void Enqueue(int data) {
        if (!isFull()) {
            arr[rear] = data;
            rear = (rear + 1) % 5;//use modulas operator for circular array
            //when finished the index number 4,it agains goes to index number 0
            //5%5==0
            //6%5==1;goes to the first index
            size++;
            // System.out.print("insert "+size);
        } else {
            System.out.println("Queue is Full = "+data);
        }
    }

    public int Dequeue() {
        int data = arr[front];//delete the first element which index is 0
        if (!isEmpty()) {
            front = (front + 1) % 5;//point to the next index,that menas index number is 0
            // System.out.println("delete :"+size);
            size--;

        } else {
            System.out.println("Queue is Empty");
        }

        return data;//return the index number 0's element
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;//when there is no elements ,that means 0
    }

    public boolean isFull() {
        return size == 5;
    }

    public void show() {
        System.out.print("Elements : " + "");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % 5] + " ");
        }
    }

}
