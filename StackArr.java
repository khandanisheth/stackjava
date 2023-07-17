package DSAjava.Stack;
import java.util.Scanner;
public class StackArr {
    public int top=-1;
    /* push Stack Operation */
    public void push(int[] arr,int n)
    {
        if(top==n-1)
        {
            System.out.println("Stack Over Flow \n");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Stack Item->");
            int item=sc.nextInt();
            top++;
            arr[top]=item;
            System.out.println("Push Operation is SuccessFully ");
        }
    }
     /* Pop Stack Operation */
    public void pop(int []arr)
    {
        int item;
        if(top==-1)
        {
             System.out.println("Stack Under Flow \n");
        }
        else
        {
            item=arr[top];
            System.out.println("Stack Pop Item ->"+item);
            top--;
        }
    }
     /* Treverse Stack Operation */
    public void trevers(int []arr)
    {
        if(top==-1)
        {
             System.out.println("Stack Is Empty \n");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        StackArr arr=new StackArr();
        Scanner scanner = new Scanner(System.in);
        int[] stack;
        int n, choice;

        System.out.print("Enter Stack Capacity => ");
        n = scanner.nextInt();

        stack = new int[n];

        while (true) {
            System.out.println("Press:");
            System.out.println("1. Push Operation");
            System.out.println("2. Pop Operation");
            System.out.println("3. Stack Display");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice => ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arr.push(stack, n);
                    break;
                case 2:
                    arr.pop(stack);
                    break;
                case 3:
                    arr.trevers(stack);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please Enter a Valid Choice.");
            }
        }
    }
}
