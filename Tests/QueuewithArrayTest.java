import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuewithArrayTest {

    @Test
    void testEnqueue() {

        int arr[]={1,2,3,4};
        int s=4;

        QueuewithArray queue = new QueuewithArray(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],queue.array[i]);
        }
        assertEquals(s,queue.size);

    }

    @Test
    void testEnqueueTest2(){

        int arr[]={1,2,3,4};
        int s=4;

        QueuewithArray queue=new QueuewithArray(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],queue.array[i]);
        }

        queue.display();

    }

   @Test
    void testDequeue() {
       int arr[]={1,2,3,4};
       int s=4;

       QueuewithArray queue = new QueuewithArray(4);

       queue.enqueue(1);
       queue.enqueue(2);
       queue.enqueue(3);
       queue.enqueue(4);

       for (int i = 0; i < s; i++) {
           assertEquals(arr[i],queue.dequeue());
       }

       assertEquals(0,queue.size);
    }

    @Test
    void testDequeueEmpty(){

        QueuewithArray queue = new QueuewithArray(4);

        assertEquals(-1,queue.dequeue());
    }

    @Test
    void testDisplay() {

        int arr[] = {1,2,3,4,5,6};
        int len=0;

        QueuewithArray queue = new QueuewithArray(6);

        queue.display();
        //since the queue is empty the size of the queue will be zero
        assertEquals(0,queue.size);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.print("Queue : ") ;
        for(int i=queue.removePointer;i<queue.size+queue.removePointer;i++){
            System.out.print(queue.array[i] + " ");
        }
        System.out.println();

        queue.display();

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],queue.array[i]);
        }

    }
}