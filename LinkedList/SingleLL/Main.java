package LinkedList.SingleLL;

public class Main {
    
    public static void main(String[] args) {
        
        SingleLinkedList s = new SingleLinkedList();
        s.singleLinkedList(10);
        System.out.println(s.head.value);

        
        //inserting logic 
        s.insertNoad(100, 1);
        s.insertNoad(200, 2);
        s.insertNoad(300, 3);

        System.out.println(s.head.next.value);
        System.out.println(s.head.next.next.value);
        System.out.println(s.head.next.next.next.value);
    }
}
