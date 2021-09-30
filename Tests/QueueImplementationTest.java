import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplementationTest {

    @Test
    void testEnqueue() throws Exception {
        int arr[] = {1, 2, 3, 4, 5};
        int s = 5;

        QueueImplementation queue = new QueueImplementation(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i], queue.array[i]);
        }

    }

    @Test
    void testEnqueueException() throws Exception{

        QueueImplementation queue = new QueueImplementation(1);

        try{queue.enqueue(1);
        queue.enqueue(2);}

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testEnqueueTest2() throws Exception{

        int arr[] = {1, 2, 3, 4};
        int s = 4;

        QueueImplementation queue = new QueueImplementation(5);

        try {
            queue.enqueue(1);
            queue.dequeue();
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            queue.enqueue(7);
            queue.enqueue(8);

            for (int i = 0; i < s; i++) {
                assertEquals(arr[i], queue.array[i]);
            }

            queue.display();
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testDequeue() throws Exception{

        try {
            QueueImplementation queue = new QueueImplementation(4);

            int arr[] = {1, 2, 3, 4};
            int s = 4;

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);

            for (int i = 0; i < s; i++) {
                assertEquals(arr[i],queue.dequeue());
            }

            queue.display();
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void testDequeueTest2() throws Exception{

        try {
            QueueImplementation queue = new QueueImplementation(4);

            int arr[] = {1, 2, 3, 4};
            int s = 4;

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);

            for (int i = 0; i < s; i++) {
                assertEquals(arr[i],queue.dequeue());
            }

            queue.display();

            queue.dequeue();

            assertEquals(0,queue.removePointer);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void testDequeueException() throws Exception{

        try {

            QueueImplementation queue = new QueueImplementation(4);
            queue.dequeue();
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   @Test
    void testEmpty() {

        QueueImplementation queue = new QueueImplementation(4);

        assertEquals(true,queue.empty());
    }

    @Test
    void testEmptyTest2() throws Exception{

        QueueImplementation queue = new QueueImplementation(4);

        queue.enqueue(1);
        assertEquals(false,queue.empty());
    }

    @Test
    void testSize() throws Exception{
        QueueImplementation queue = new QueueImplementation(4);

        queue.enqueue(1);

        assertEquals(1,queue.size());

    }

    @Test
    void testDisplay() throws Exception{

        QueueImplementation queue = new QueueImplementation(6);

        int arr[]={1,2,3,4,5,6};
        int len=6;

        queue.display();
        // The queue is empty so the sizeofQueue will be zero
        assertEquals(0,queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.print("Queue : ");
        for(int i=queue.removePointer; i<(queue.sizeofQueue+queue.removePointer);i++){
            System.out.print(queue.array[i] + " ");
        }
        System.out.println("");

        queue.display();

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i], queue.array[i]);
        }

    }
}