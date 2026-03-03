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
}
