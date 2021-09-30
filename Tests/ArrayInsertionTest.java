import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInsertionTest {

    @Test
    void testInsert() {

        int arr[]={0,0,0,0,0,0,0,0,0,0};
        int len=10;

        int expected_arry[]={1,2,5,3,4,6,7,8,2,0};
        int expected_length=9;

        ArrayInsertion obj=new ArrayInsertion();

        arr=obj.insert(arr,1,0);
        arr=obj.insert(arr,5,1);
        arr=obj.insert(arr,4,2);
        arr=obj.insert(arr,7,3);
        arr=obj.insert(arr,2,4);
        arr=obj.insert(arr,6,3);
        arr=obj.insert(arr,3,2);
        arr=obj.insert(arr,2,1);
        arr=obj.insert(arr,8,7);

        System.out.println(obj.size);
        for (int i = 0; i < len; i++) {
                assertEquals(expected_arry[i], arr[i]);
            }

        assertEquals(expected_length,obj.size);
    }

    @Test
    void testDisplay() {

        int arr[]={21,323,43454,65656,565,45435};
        int len=6;

        ArrayInsertion obj = new ArrayInsertion();

        obj.display(arr);

        for(int i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}