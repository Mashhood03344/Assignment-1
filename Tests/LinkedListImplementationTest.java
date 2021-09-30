import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListImplementationTest {

    @Test
    void testAdd() {
        LinkedListImplementation list = new LinkedListImplementation();

        list.numofElements=0;

        int arr[]={1,2,3,4,5,6};
        int len =6;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        LinkedListImplementation temp = list.headPointer;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.data);
            temp=temp.nextPointer;
        }

        assertEquals(len, list.numofElements);


        LinkedListImplementation backup = null;
        while (list.headPointer != null) {
            backup = list.headPointer.nextPointer;
            list.headPointer = null;
            list.headPointer = backup;

            list.numofElements--;
        }

    }

    @Test
    void testPushFront() {

        LinkedListImplementation list1 = new LinkedListImplementation();

        list1.numofElements=0;

        int arr[]={6,5,4,3,2,1};
        int len =6;

        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);

        LinkedListImplementation temp = list1.headPointer;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.data);
            temp=temp.nextPointer;
        }

        LinkedListImplementation backup = null;
        while (list1.headPointer != null) {
            backup = list1.headPointer.nextPointer;
            list1.headPointer = null;
            list1.headPointer = backup;

            list1.numofElements--;
        }
    }

    @Test
    void testTopFrontException () throws Exception {

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.topFront();
            //The list is empty and there is nothing on the top so the headPointer will be null
            assertEquals(null, list.headPointer);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testTopFront() throws  Exception{

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.numofElements=0;

            list.pushBack(1);
            list.pushBack(2);
            list.pushBack(3);
            list.pushBack(4);
            list.pushBack(5);
            list.pushBack(6);

            assertEquals(1,list.topFront());

            LinkedListImplementation backup = null;
            while (list.headPointer != null) {
                backup = list.headPointer.nextPointer;
                list.headPointer = null;
                list.headPointer = backup;

                list.numofElements--;
            }

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPopFrontException() throws  Exception {

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.popFront();
            //The list is empty and there is nothing on the top so the headPointer will be null
            assertEquals(null, list.headPointer);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPopFrontOneElement() throws  Exception {

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.pushBack(1);

            list.popFront();
            //The list has only one element and after poping the list will be empty and the headPointer and tailPointer will be null
            assertEquals(null, list.headPointer);
            assertEquals(null, list.tailPointer);

            LinkedListImplementation backup = null;
            while (list.headPointer != null) {
                backup = list.headPointer.nextPointer;
                list.headPointer = null;
                list.headPointer = backup;

                list.numofElements--;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Test
    void testPopFront() throws  Exception {

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.numofElements=0;

            int arr[]={2,3,4,5,6};
            int len=5;

            list.pushBack(1);
            list.pushBack(2);
            list.pushBack(3);
            list.pushBack(4);
            list.pushBack(5);
            list.pushBack(6);

            list.popFront();

            LinkedListImplementation temp = list.headPointer;

            for (int i = 0; i < len; i++) {
                assertEquals(arr[i],temp.data);
                temp = temp.nextPointer;
            }

            LinkedListImplementation backup = null;
            while (list.headPointer != null) {
                backup = list.headPointer.nextPointer;
                list.headPointer = null;
                list.headPointer = backup;

                list.numofElements--;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Test
    void testPushBack() {

        LinkedListImplementation list = new LinkedListImplementation();

        list.numofElements=0;

        int arr[]={1,2,3,4,5,6};
        int len =6;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);


        LinkedListImplementation temp = list.headPointer;

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],temp.data);
            temp=temp.nextPointer;
        }

        assertEquals(len, list.numofElements);

        LinkedListImplementation backup = null;
        while (list.headPointer != null) {
            backup = list.headPointer.nextPointer;
            list.headPointer = null;
            list.headPointer = backup;

            list.numofElements--;
        }

    }

    @Test
    void testTopBackException () throws Exception {

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.topBack();
            //The list is empty and there is nothing on the top so the headPointer will be null
            assertEquals(null, list.headPointer);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testTopBack() throws  Exception{

        try {
            LinkedListImplementation list = new LinkedListImplementation();

            list.numofElements=0;

            list.pushBack(1);
            list.pushBack(2);
            list.pushBack(3);
            list.pushBack(4);
            list.pushBack(5);
            list.pushBack(6);

            assertEquals(6,list.topBack());

            LinkedListImplementation backup = null;
            while (list.headPointer != null) {
                backup = list.headPointer.nextPointer;
                list.headPointer = null;
                list.headPointer = backup;

                list.numofElements--;
            }

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    @Test
    void testDisplay() {

        int arr[]={1,2,3,4,5,6};
        int len=6;

        LinkedListImplementation list = new LinkedListImplementation();

        list.numofElements=0;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("LinkedList : ");
        System.out.print("[ ");
        LinkedListImplementation temp = list.headPointer;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.nextPointer;
        }
        System.out.println("]");

        list.display();

        temp = list.headPointer;
        for (int i = 0; i < len; i++) {
            assertEquals(arr[i], temp.data);
            temp = temp.nextPointer;

        }

    }

    @Test
    void testSize() {

        LinkedListImplementation list = new LinkedListImplementation();

        list.numofElements=0;

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushBack(6);

        assertEquals(6,list.size());
    }
}