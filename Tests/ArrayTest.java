import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testInsert() {

        int expected_array[]={1,2,3,4,5,6,7,8,9,10};
        int expected_size=10;

        Array obj = new Array();

        for (int i = 0; i < expected_size; i++) {
            obj.insert(expected_array[i],i);
        }

        assertEquals(expected_size,obj.size);
    }

    @Test
    void testDelete() {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        int expected_array[]={1,2,3,4,6,7,8,9,10};
        int expected_size=9;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        obj.delete(4);

        for (int i = 0; i < expected_size; i++) {
            assertEquals(expected_array[i],obj.array[i]);
        }

        assertEquals(expected_size,obj.size);
    }

    @Test
    void testDisplay() {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        for(int i=0;i<obj.size;i++){
            System.out.print(obj.array[i] + " ");
        }
        System.out.println();

        obj.display();

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],obj.array[i]);
        }
    }

    @Test
    void testLinearSearchFound() {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        boolean expected=true;
        boolean res;

        res=obj.linearSearch(10);

        assertEquals(expected,res);
    }

    @Test
    void testLinearSearchNotFound() {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        boolean expected=false;
        boolean res;

        res=obj.linearSearch(20);

        assertEquals(expected,res);
    }

    @Test
    void testBubbleSort() {

        int expected_array[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        int arr[]={3,5,4,2,8,10,7,1,9,6};

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        obj.bubbleSort();

        for (int i = 0; i < len; i++) {
            assertEquals(expected_array[i],obj.array[i]);
        }
    }

    @Test
    void testBinarySearchFound() {
    //for binary search the arrat should sorted

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        boolean expected=true;
        boolean res=obj.binarySearch(5,0,5);

        assertEquals(expected,res);

    }

    @Test
    void testBinarySearchNotFound() {
        //for binary search the arrat should sorted

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        boolean expected=false;
        boolean res=obj.binarySearch(20,2,9);

        assertEquals(expected,res);

    }

    @Test
    void testBinarySearchFound2() {
        //for binary search the arrat should sorted

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=10;

        Array obj = new Array();

        for (int i = 0; i < len; i++) {
            obj.insert(arr[i],i);
        }

        boolean expected=true;
        boolean res=obj.binarySearch(1,0,5);

        assertEquals(expected,res);

    }
}