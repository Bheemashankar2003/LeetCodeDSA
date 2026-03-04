package LinkedList.SingleLL.Delete;

public class SingleLL {
    
    Node head;
    Node tail;
    int size;

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
        
    }
}
