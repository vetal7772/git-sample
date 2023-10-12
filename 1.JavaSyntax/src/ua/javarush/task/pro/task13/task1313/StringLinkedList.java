package ua.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        public Node() {

        }

        public Node(Node prev, String value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public Node(String value) {
        }

        public Node getPrev() {
            return prev;
        }

        public String getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
