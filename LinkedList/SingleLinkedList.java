package LinkedList;

public class SingleLinkedList {
    
    Node head;
    Node tail;
    int size;

    public Node SingleLinkedList(int valueToAssign){

        Node node = new Node();
        node.value = valueToAssign;
        node.next= null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
