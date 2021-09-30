import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDeletionTest {

    @Test
    void testDeleteReturnOrginalArary(){
        int arr[]={1,2,3,4,5,6};
        int len=6;

        ArrayDeletion obj = new ArrayDeletion();

       int res[]= obj.delete(arr,6);

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],res[i]);
        }
    }

    @Test
    void testDelete(){

        int arr[]={1,2,3,4,5,6};
        int len=6;

        int expected_array[]={1,2,4,5,6,-1};
        int expected_length=5;

        ArrayDeletion obj = new ArrayDeletion();

        int res[]= obj.delete(arr,2);

        for (int i = 0; i < expected_length; i++) {
            assertEquals(expected_array[i],res[i]);
        }

    }

    @Test
    void testDisplay() {

        int arr[]={21,323,43454,65656,565,45435};
        int len=6;

        ArrayDeletion obj = new ArrayDeletion();

        obj.display(arr);

        for(int i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}