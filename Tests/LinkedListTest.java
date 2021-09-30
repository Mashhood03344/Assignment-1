import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testPushFront(){
        LinkedList list = new LinkedList();

        int arr[]={6,5,4,3,2,1};
        int len =6;

        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);

    }

    @Test
    void testPushBack(){

        LinkedList list = new LinkedList();

        int arr[]={1,2,3,4,5,6};
        int len =6;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);
    }

    @Test
    void testPopFront(){
        LinkedList list = new LinkedList();

        int arr[]={2,3,4,5,6};
        int len=5;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);
        list.popFront();

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);
    }

    @Test
    void testPopFrontNull(){

        LinkedList list = new LinkedList();

        list.popFront();

        assertEquals(0,list.size);
    }

    @Test
    void testPopBack(){

        LinkedList list = new LinkedList();

        int arr[]={1,2,3,4,5};
        int len=5;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);
        list.popBack();

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);
    }

    @Test
    void testPopBackOneValue(){

        LinkedList list = new LinkedList();

        list.pushBack(1);

        list.popBack();

        //After poping the only element in the linked list the list will be empty and the size will be zero
        assertEquals(null,list.head);
        assertEquals(0,list.size);
    }

    @Test
    void testPopBackEmptyList(){
        LinkedList list = new LinkedList();

        list.popBack();

        //Since the list is empty so the head will be null and the size of the list will be 0
        assertEquals(null,list.head);
        assertEquals(0,list.size);
    }

    @Test
    void testPopFirstElement(){

        LinkedList list = new LinkedList();

        int arr[]={2,3,4,5,6};
        int len =5;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        //Checking the required function viod  pop() by poping the first element
        list.pop(0);

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

        assertEquals(len,list.size);
    }

    @Test
    void testPop() {

        LinkedList list = new LinkedList();

        int arr[] = {1, 2, 4, 5, 6};
        int len = 5;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        //Checking the required function viod  pop() by poping the first element
        list.pop(2);

        LinkedList.Node temp = list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i], temp.key);
            temp = temp.next;
        }

        assertEquals(len, list.size);
    }

    @Test
    void testDisplayNull(){
        LinkedList list = new LinkedList();

        list.display();

        //Since the list is empty so the head will be null and the size of the list will be 0
        assertEquals(null,list.head);
        assertEquals(0,list.size);
    }

    @Test
    void testDisplay(){
        LinkedList list = new LinkedList();

        int arr[]={1,2,3,4,5,6};
        int len =6;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        System.out.print("LinkedList : ");
        LinkedList.Node temp = list.head;
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

        assertEquals(len,list.size);
    }
}