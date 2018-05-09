package ProgrammingExercises.LinkedList.DoubleLinkedListInJava;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    DoublyLinkedList() {

    }

    DoublyLinkedList(int data) {
        this.head = new DoublyLinkedNode(data);
    }

    public void insertAtHead (int data) {
        DoublyLinkedNode node = new DoublyLinkedNode(data);
        if(this.head == null) {
            this.head = node;
            return;
        }

        node.setNext(this.head);
        this.head.setPrev(node);
        this.head = node;
    }

    public int length() {
        if(head == null) {
            return 0;
        }
        DoublyLinkedNode node = head;
        int counter = 1;
        while (node.getNext() != null) {
            counter++;
            node = node.getNext();
        }
        return counter;
    }

    @Override
    public String toString() {
        if(head == null) {
            return "List is empty.";
        }
        DoublyLinkedNode node = head;
        StringBuilder str = new StringBuilder(Integer.toString(node.getData()));
        while (node.getNext() != null) {
            node = node.getNext();
            str.append(", ");
            str.append(node.getData());
        }
        return str.toString();
    }
}
