import java.util.Scanner;
public class stackArray {

    static int[] stack;
    static int top = -1;
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        size = sc.nextInt();
        stack = new int[size];

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    push(element);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack overflow!");
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed to stack.");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

