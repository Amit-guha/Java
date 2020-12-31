package LinkedList_Implementaiton;

/**
 *
 * @author amitguho
 */
public class linklist {

    Node head;

    public void insert(int data) {
        Node node = new Node();//create new node
        node.data = data;//store data
        node.next = null;

        if (head == null) {//check if null or not,,because first time it fullfil the condition
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {//last node refer to null,,so check the last node
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertStartAt(int data) {
        Node node = new Node();//create new node
        node.data = data;//store data
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertMiddle(int index, int data) {
        Node node = new Node();//create new node
        node.data = data;//store data
        node.next = null;

        if (index == 0) {
            insertStartAt(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1=null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1=n.next;
            n.next=n1.next;
            

        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
