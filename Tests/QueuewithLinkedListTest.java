import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuewithLinkedListTest {

    @Test
    void testEnqueue() {

        QueuewithLinkedList queue = new QueuewithLinkedList();

        int arr[]={1,2,3,4,5};
        int s=5;

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        QueuewithLinkedList.Node temp= QueuewithLinkedList.head;
        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(s,queue.size);

    }

    @Test
    void testDequeue() {

        QueuewithLinkedList queue = new QueuewithLinkedList();

        int arr[]={1,2,3,4,5};
        int s=5;

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],queue.dequeue());
        }

        assertEquals(0,queue.size);

    }

    @Test
    void testDequeueEmpty(){

        QueuewithLinkedList queue = new QueuewithLinkedList();

        assertEquals(-1,queue.dequeue());
    }

    @Test
    void testDisplay() {

        int arr[]={1,2,3,4,5,6};
        int len=6;

       QueuewithLinkedList queue = new QueuewithLinkedList();

        queue.display();
        //since the queue is empty the head will be null and the size of the queue will be 0
        assertEquals(0,queue.size);
        assertEquals(null,queue.head);


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.print("Queue : ");
        QueuewithLinkedList.Node temp = queue.head;
        while(temp!=null){
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
        System.out.println();

        queue.display();

        temp = queue.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

    }
}