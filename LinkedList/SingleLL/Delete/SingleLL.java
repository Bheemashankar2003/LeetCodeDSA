package LinkedList.SingleLL.Delete;

public class SingleLL {
    
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

    //for inserting in middle
    public void insertNoad(int nodeValue, int location){

        Node node = new Node();
        node.value = nodeValue;

        if(head == null){                //O(1)
            singleLinkedList(nodeValue);
            return;
        }
        else if(location == 0){           //O(1)
            node.next = head;
            head = node;
        }
        else if(location >= size){        //O(1)
            node.next = null;
            tail.next = node;
            tail = node;
        }else {                           //O(1)
            Node tempNode = head;
            int ind = 0;
            while(ind<location-1){        //O(n)
              tempNode = tempNode.next;
              ind++;
            }

            Node nexNode = tempNode.next; //O(1)
            tempNode.next = node;
            node.next = nexNode;
        }
        size++;
    }

    //traversal 
    public void traverseSingleLinkedList(){

        Node tempNode = head;

        for(int i = 0;i<size;i++){
            System.out.println(tempNode.value);
            if(i !=size-1)
                System.out.print("--->");
            tempNode = tempNode.next;
        }
    }

    //for deleteing
    public void deleteSingleLL(int location){

        if(head == null){
          System.out.println("The SingleLL doesn't exits");
          return;
        }else if(location == 0){

            head = head.next;
            size--;
            if(size == 0){
                head = null;
                tail = null;
            }
        }
        else if(location >=size){
            Node tempNode = head;
            for(int i = 0;i<size;i++){
               tempNode = tempNode.next;
            }
            if(tempNode == head){
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i = 0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSingleLL(){
        head = null;
        tail = null;
        System.out.println("deleted entire singlelinkedlist");
    }
}
