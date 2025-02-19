package Lab1;

public class Main {
    // Function to print a linked list
    public static void printLinkedList(Node current) {
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    // Function to create a linked list from an array
    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }

    // Function to count the length of the linked list
    public static int countLength(Node current) {
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Function to print the first 'n' elements of the linked list
    public static void printNElements(Node current, int n) {
        int length = countLength(current);
        if (n > length) n = length;

        while (n > 0 && current != null) {
            System.out.println(current.value);
            current = current.next;
            n--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 12};
        Node head = createLinkedList(arr);

        System.out.println("Printing full linked list:");
        printLinkedList(head);

        System.out.println("\nPrinting first 3 elements:");
        printNElements(head, 3);
    }
}
