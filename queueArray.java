import java.util.Scanner;
public class queueArray {

    static int[] queue;
    static int front = 0;
    static int rear = -1;
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        size = sc.nextInt();
        queue = new int[size];

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter element: ");
                int element = sc.nextInt();
                enqueue(element);
            } else if (choice == 2) {
                dequeue();
            } else if (choice == 3) {
                display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }

    public static void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
        } else {
            queue[++rear] = element;
            System.out.println(element + " added");
        }
    }

    public static void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(queue[front] + " removed");
            front++;
        }
    }

    public static void display() {
        if (front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
