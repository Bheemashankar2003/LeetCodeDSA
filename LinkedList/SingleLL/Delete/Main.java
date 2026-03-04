package LinkedList.SingleLL.Delete;

public class Main {
    
    public static void main(String[] args) {
        
        SingleLL s = new SingleLL();
        s.singleLinkedList(10);
        System.out.println(s.head.value);

        //inserting logic 
        s.insertNoad(100, 1);
        s.insertNoad(200, 2);
        s.insertNoad(300, 3);
        s.insertNoad(400, 4);
        s.insertNoad(500, 5);

        System.out.println(s.head.next.value);

        s.traverseSingleLinkedList();
        s.deleteSingleLL(0);
        s.traverseSingleLinkedList();
        s.deleteSingleLL(1); 
        s.traverseSingleLinkedList();
        s.deleteSingleLL(2);
        
    }
}
