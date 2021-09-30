import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeueTest {

    @Test
    void testAddLeft() {

        int arr[]={1,2,3,4,5};
        int s=5;

        Dequeue dequeue=new Dequeue(5);

        dequeue.addLeft(1);
        dequeue.addLeft(2);
        dequeue.addLeft(3);
        dequeue.addLeft(4);
        dequeue.addLeft(5);
        dequeue.addLeft(6);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],dequeue.array[i]);
        }

    }

    /*@Test
    void addLeftTest2(){
        int arr[]={};
        int s;

        Dequeue dequeue = new Dequeue();

        dequeue.addLeft();

        for (int i = 0; i < s; i++) {

        }
    }*/

    @Test
    void testAddRight() {

        int arr[]={5,4,3,2,1};
        int s=5;

        Dequeue dequeue=new Dequeue(5);

        dequeue.addRight(1);
        dequeue.addRight(2);
        dequeue.addRight(3);
        dequeue.addRight(4);
        dequeue.addRight(5);
        dequeue.addRight(6);

        for (int i = 0; i < s; i++) {
            assertEquals(arr[i],dequeue.array[i]);
        }
    }

    @Test
    void testDisplay() {

        int arr[] ={1,2,3,4,5,6};
        int len=6;

        Dequeue queue = new Dequeue(6);

        queue.addLeft(1);
        queue.addLeft(2);
        queue.addLeft(3);
        queue.addLeft(4);
        queue.addLeft(5);
        queue.addLeft(6);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");

        queue.display();

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],queue.array[i]);
        }

    }
}