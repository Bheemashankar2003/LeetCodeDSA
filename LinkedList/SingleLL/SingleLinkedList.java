package LinkedList.SingleLL;

public class SingleLinkedList {
    
    Node head;
    Node tail;
    int size;

    public Node singleLinkedList(int valueToAssign){

        Node node = new Node();
        node.value = valueToAssign;
        node.next= null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    //forinserting in middle
    public void insertNoad(int nodeValue, int location){

        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            singleLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            int ind = 0;
            while(ind<location-1){
              tempNode = tempNode.next;
              ind++;
            }
            
            Node nexNode = tempNode.next;
            tempNode.next = node;
        }
    }
}
