package LinkedList;

public class Singly {

    // node or we can say the structure of the linked list
    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            value = val;
            next = null;
        }

        public Node(int val,Node nxt){
            value = val;
            next = nxt;
        }
    }//structure over

    // basic operators we want while executing the linked list
    private Node head;
    private Node tail;
    private int size;
    public Singly(){
        this.size = 0;
    }//operations over

    // insert the new element at first in the linked list
    public void InsertEFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        //if this was the first node
        if(tail == null){
            tail = node;
        }

        size++;
    }//insertion first over

    // insert the new element At last in the linked list
    public void InsertELast(int val){
        Node node = new Node(val);

        // if there was no element in the linked list
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }

        size++;
    }// insertion last over

    // Display the Linked List
    public void Display(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node node  = head;
        while(node != null){
            System.out.print(node.value);
            node = node.next;
            if(node != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }// display over

    //Search of keys
    public void Search(int val){
        if(tail == null){
            System.out.println("No element in the Linked List");
            return;
        }
        Node node  = head;
        while(node.value != val){
            node = node.next;
            if(node == null){
                System.out.println(val+" Not Present in the Linked List");
                return;
            }
        }
        System.out.println(val+" Present in the Linked List");
    }//Search 'key' over

    //Deletion of the node at beginning
    public void DeleteB(){
        if(head == null){
            System.out.println("No element in the Linked List");
            return;
        }
        System.out.println("Deleted Element from beginning: "+head.value);
        head = head.next;
    }//Delete beginning over

    //Deletion of the node at end
    public void DeleteE(){
        if(tail == null){
            System.out.println("No element in the Linked List");
            return;
        }
        System.out.println("Deleted Element from end: "+tail.value);
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node node  = head;
        while(node.next != tail){
            node = node.next;
        }
        tail = node;
        node.next = null;
    }//Delete end over

    //Deletion of the node which having the key
    public void DeleteKey(int val){
        if(tail == null){
            System.out.println("No element in the Linked List");
            return;
        }
        if(head.value == val){
            DeleteB();
            return;
        }
        Node node  = head;
        while(node.next.value != val){
            node = node.next;
            if(node.next == null){
                System.out.println("No key found in the Linked List");
                return;
            }
        }
        System.out.println(val+" Deleted");
        node.next = node.next.next;
    }//Delete 'key' over


    // main function starts here
    public static void main(String[] args) {
        Singly ll = new Singly();
        ll.InsertEFirst(123);
        ll.InsertELast(12);
        ll.InsertELast(1);
        ll.Display();
//        ll.DeleteE();
//        ll.Display();
        ll.DeleteKey(12);
        ll.Display();

    }


}
