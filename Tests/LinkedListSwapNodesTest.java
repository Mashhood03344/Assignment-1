import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSwapNodesTest {

    @Test
    void testPushFront() {


        int arr[]={6,5,4,3,2,1};
        int len = 6;

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.size=0;

        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);

        LinkedListSwapNodes.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);

    }

    @Test
    void testPushBack() {

        int arr[]={1,2,3,4,5,6};
        int len = 6;

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        LinkedListSwapNodes.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);

    }

    @Test
    void testSwap() {

        int arr[]={6,2,3,4,5,1};
        int len = 6;

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        list.swap();

        LinkedListSwapNodes.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }
    }

    @Test
    void testSwapTwoValues(){

        int arr[]={2,1};
        int len=2;

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.pushBack(1);
        list.pushBack(2);

        list.swap();

        list.display();

        LinkedListSwapNodes.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

    }


    @Test
    void testDisplay() {

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.display();
        //The linked list is empty so the head will be null
        assertEquals(null,list.head);
    }

    @Test
    void testDisplay2(){

        int arr[]={1,2,3,4,5,6};
        int len = 6;

        LinkedListSwapNodes list = new LinkedListSwapNodes();

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        System.out.print("List : ");
        LinkedListSwapNodes.Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.key +  " ");
            temp=temp.next;
        }
        System.out.println();

        list.display();

        temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }
    }
}