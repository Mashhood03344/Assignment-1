import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void testPush() throws Exception{

        try{
        MyStack stack = new MyStack(5);

        int arr[] = {1,2,3,4,5};
        int len=5;

        stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            for (int i = 0; i < len; i++) {
                assertEquals(arr[i],stack.arraytostoreStack[i]);
            }

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPushException() throws Exception{

        try{
            MyStack stack = new MyStack(5);

            int arr[] = {1,2,3,4,5};
            int len=5;

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.displayStack();
            assertEquals(len-1,stack.topPointer);
            stack.push(6);

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testTop() throws  Exception{

        try {
            MyStack stack = new MyStack(5);

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            assertEquals(5, stack.top());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testTopEmpty() throws  Exception{
        try{
        MyStack stack = new MyStack(4);

        stack.top();

        assertEquals(-1,stack.topPointer);

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPop() throws Exception{

        try {
            MyStack stack = new MyStack(5);

            int arr[] = {5, 4, 3, 2, 1};
            int len = 5;

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            for (int i = 0; i < len; i++) {
                assertEquals(arr[i],stack.pop());
            }

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPopEmpty() throws Exception {

        try {

            MyStack stack = new MyStack(5);
            assertEquals(-1, stack.topPointer);
            assertEquals(0,stack.size());
            stack.pop();

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testSize() throws Exception{

        try {
            int len = 5;

            MyStack stack = new MyStack(5);

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            assertEquals(len, stack.size());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testSizeNegative() throws Exception{

        try {
            MyStack stack = new MyStack(-1);
            assertEquals(0,stack.size());
            assertEquals(-1, stack.topPointer);

            stack.push(1);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void testDisplayStack() throws Exception{

        MyStack stack = new MyStack(5);

        int arr[] = {1,2,3,4,5};
        int len = 5;

        try{
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            System.out.print("Stack : [" + " ");
            for(int i=0;i<=stack.topPointer;i++){
                System.out.print(stack.arraytostoreStack[i]+" ");
            }
            System.out.println("]");

            stack.displayStack();

            for (int i = 0; i < len; i++) {
                assertEquals(arr[i],stack.arraytostoreStack[i]);
            }


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}