package algorithms.sorts.leetcode;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void bubbleSort() {
        if (this.length < 2)
            return;

        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }

    void selectionSort() {
        if (this.length < 2)
            return;
        Node current = this.head;
        while (current.next != null) {
            Node smallest = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.value < smallest.value) {
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            if (smallest != current) {
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            current = current.next;
        }
        this.tail = current;
    }

    public void insertionSort() {
        if (length < 2) {
            return; // List is already sorted
        }

        Node sortedListHead = head;
        Node unsortedListHead = head.next;
        sortedListHead.next = null;

        while (unsortedListHead != null) {
            Node current = unsortedListHead;
            unsortedListHead = unsortedListHead.next;

            if (current.value < sortedListHead.value) {
                current.next = sortedListHead;
                sortedListHead = current;
            } else {
                Node searchPointer = sortedListHead;
                while (searchPointer.next != null && current.value > searchPointer.next.value) {
                    searchPointer = searchPointer.next;
                }
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
        }

        head = sortedListHead;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

}
