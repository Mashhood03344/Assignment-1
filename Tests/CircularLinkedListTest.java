import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

    @Test
    void testPushFront() {

        CircularLinkedList list = new CircularLinkedList();

        int arr[]={6,5,4,3,2,1,6};

        int len =7;

        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);

        CircularLinkedList.Node temp=list.head;

        int i=0;
        while(temp!=list.head){
            assertEquals(arr[i],temp.key);
            temp=temp.next;
            i++;
        }

        //checking whether the linked list is really circular or not
        assertEquals(arr[i],temp.key);

        //Another Method to test if the list is circular or not
        temp=list.head;
        for (int j = 0; j < len; j++) {
            assertEquals(arr[j],temp.key);
            temp=temp.next;
        }

    }

    @Test
    void testPushBack() {
        CircularLinkedList list = new CircularLinkedList();

        int arr[]={1,2,3,4,5,6,1};

        int len =7;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        CircularLinkedList.Node temp=list.head;

        int i=0;
        while(temp!=list.head){
            assertEquals(arr[i],temp.key);
            temp=temp.next;
            i++;
        }

        //checking whether the linked list is really circular or not
        assertEquals(arr[i],temp.key);

        //Another Method to test if the list is circular or not
        temp=list.head;
        for (int j = 0; j < len; j++) {
            assertEquals(arr[j],temp.key);
            temp=temp.next;
        }
    }

    @Test
    void testPopFrontEmpty() {

        CircularLinkedList list = new CircularLinkedList();

        list.popFront();
        //Since the list is empty the head will be null
        assertEquals(null,list.head);
    }

    @Test
    void testPopFrontOneElement() {

        CircularLinkedList list = new CircularLinkedList();

        list.pushBack(1);

        list.popFront();
        //Since the list had only one element and after the poping is empty so the head will be null
        assertEquals(null,list.head);
    }

    @Test
    void testPopFront() {

        CircularLinkedList list = new CircularLinkedList();

        int arr[]={2,3,4,5,6,2};
        int len=6;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        list.popFront();

        CircularLinkedList.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }
    }

    @Test
    void testPopBackEmpty() {

        CircularLinkedList list = new CircularLinkedList();

        list.popBack();
        //Since the list is empty the head will be null
        assertEquals(null,list.head);
    }

    @Test
    void testPopBackOneElement() {

        CircularLinkedList list = new CircularLinkedList();

        list.pushBack(1);

        list.popBack();
        //Since the list had only one element and after the poping is empty so the head will be null
        assertEquals(null,list.head);
    }

    @Test
    void testPopBack() {

        CircularLinkedList list = new CircularLinkedList();

        int arr[]={1,2,3,4,5,1};
        int len=6;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        list.popBack();

        CircularLinkedList.Node temp = list.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }
    }

    @Test
    void testDisplay() {

        CircularLinkedList list = new CircularLinkedList();
        int arr[]={1,2,3,4,5,6,1};
        int len=7;

        list.display();
        //Nothing to show since the list is empty and the head is null
        assertEquals(null,list.head);

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        System.out.print("List : ");
        CircularLinkedList.Node temp = list.head;

        while(temp.next!=list.head){
            System.out.print(temp.key+" ");
            temp=temp.next;
        }
        System.out.println(temp.key);

        System.out.println("");

        list.display();

        temp=list.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

    }

}