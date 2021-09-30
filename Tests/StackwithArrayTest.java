import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackwithArrayTest {

    @Test
    void testPush() {

        StackwithArray stack = new StackwithArray();

        int arr[]=new int[100];

        int n =1;

        for (int i = 0; i <100; i++) {
            arr[i]=n;
            n++;
        }

        n=1;

        //Checking if the value of addPointer becomes greater than 100 if we go beyond 100
        for (int i = 0; i < 102; i++) {
            stack.push(n);
            n++;
        }

        for (int i = 0; i < 100; i++) {
            assertEquals(arr[i],stack.array[i]);
        }

        assertEquals(100,stack.addPointer);

    }

    @Test
    void testPop() {

        StackwithArray stack = new StackwithArray();

        int arr[]=new int[100];

        int n =100;

        //Checking the condition that the stack is empty
        stack.pop();
        assertEquals(0,stack.addPointer);

        for (int i = 0; i <100; i++) {
            arr[i]=n;
            n--;
        }

        n=1;

        //Checking if the value of addPointer becomes greater than 100 if we go beyond 100
        for (int i = 0; i < 102; i++) {
            stack.push(n);
            n++;
        }

        for (int i = 0; i < 100; i++) {
            assertEquals(arr[i],stack.pop());
        }

    }

    @Test
    void testDisplay() {

        int arr[]={1,2,3,4,5,6};
        int len = 6;

        StackwithArray stack = new StackwithArray();

        stack.display();
        //The stack is empty so the size and the addPointer will be zero
        assertEquals(0,stack.addPointer);
        assertEquals(0,stack.size);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.print("Stack : ");
        for(int i=0;i<stack.size;i++){
            System.out.print(stack.array[i] + " " );
        }
        System.out.println();

        stack.display();

        for (int i = 0; i < len; i++) {
            assertEquals(arr[i],stack.array[i]);
        }

    }
}