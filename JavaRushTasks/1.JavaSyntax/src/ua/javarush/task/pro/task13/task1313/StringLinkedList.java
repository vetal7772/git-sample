package ua.javarush.task.pro.task13.task1313;

import java.util.LinkedList;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();
    private int size;

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
     
     
        if (first.getNext() == null) {
            Node newNode = new Node();
            first.setNext(newNode) ;
            newNode.setValue(value);
        }
        if (last.getPrev()==null){
            last.setPrev(first.getNext());
            return;
        }

        Node newNode = new Node();
        newNode.setValue(value);
        
        Node lastNode = last.getPrev();
        lastNode.setNext(newNode);
        newNode.setPrev(lastNode);
        last.setPrev(newNode);


//        Node tmp = first;
//            while (tmp.getNext() != null) {
//                tmp = tmp.getNext();
//            }

//            tmp.setNext(newNode);
//            newNode.s=value;
        
        

            size++;
        }


    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        public Node() {
        }

        public Node(String value) {
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }




    }
}
