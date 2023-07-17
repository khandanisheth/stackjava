package DSAjava.Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stackclass {
    /* Push Operation  */
    public static void st1(Stack<Integer> st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Capacity: ");
        int size = sc.nextInt();
        System.out.println("Enter Stack Items (0 to Capacity): ");
        for (int i = 0; i < size; i++) {
            st.push(sc.nextInt());
        }
    }
    /* Stack Reveres Fun */
    public static void stackReverse(Stack<Integer> st) {
        Iterator it=st.iterator();
        System.out.print("Reversed Stack: 1 ->");
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
     public static void stackReverse1(Stack<Integer> st) {
        Stack<Integer> tempStack = new Stack<>();
        while (!st.isEmpty()) {
            tempStack.push(st.pop());
        }
        st.addAll(tempStack);
    }

    /* Pop Operetion  */
    public static void popop(Stack<Integer> st)
    {
        System.out.println("Pop Operation:");
        while (!st.isEmpty()) {
            int y = st.pop();
            System.out.print(y + " ");
        }
    }
    /* Search Operation  */
     static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

   /* Peek Operation */
   public static void peekOp(Stack<Integer> st) {
    System.out.println("Peek Operation:");
    if (!st.isEmpty()) {
        int y = st.peek();
        System.out.println(y);
    }
    }
   
 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        st1(stack);

        System.out.println("Original Stack: " + stack);
        stackReverse(stack);
        stackReverse1(stack);
        System.out.println("\nReversed Stack: 2 " + stack);
        System.out.println("Reversed Stack: 3 "+stack);
        peekOp(stack);
        popop(stack);
       
    }
}
