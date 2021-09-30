import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackwithLinkedListTest {

    @Test
    void testPush() {

        StackwithLinkedList stack = new StackwithLinkedList();

        int arr[] = {5,4,3,2,1};
        int len =5;

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        StackwithLinkedList.Node temp = stack.head;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

    }

    @Test
    void testTop() {

        StackwithLinkedList stack = new StackwithLinkedList();

        int arr[] = {5,4,3,2,1};
        int len =5;

        //Checking the stack is empty and there is nothing at the top
        assertEquals(-1,stack.top());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5,stack.top());
    }

    @Test
    void testPop() {

        StackwithLinkedList stack = new StackwithLinkedList();

        int arr[] = {5,4,3,2,1};
        int len =5;

        //Checking the stack is empty and there is nothing at the pop
        assertEquals(-1,stack.pop());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],stack.pop());
        }
    }

    @Test
    void testDisplay() {

        StackwithLinkedList stack = new StackwithLinkedList();

        int arr[]={6,5,4,3,2,1};
        int len=6;

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println();
        System.out.println("Stack ");
        StackwithLinkedList.Node temp=stack.head;
        while(temp!=null){
            System.out.println("----------");
            System.out.println("|   " + temp.key + "   |");
            temp=temp.next;
        }
        System.out.println("----------");
        System.out.println();

        stack.display();

        temp=stack.head;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.key);
            temp=temp.next;
        }

    }

    @Test
    void testGetSize() {

        StackwithLinkedList stack = new StackwithLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5,stack.getSize());
    }
}