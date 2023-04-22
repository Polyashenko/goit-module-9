package com.goit.module9;

public class MyQueue {

    private Node head;
    private Node tail;
    private int size; // количество элементов в списке

    public void add(Object value) { // додає елемент в кінець
        Node new_node;
        if (tail == null) {
            new_node = new Node(value, null, null);
            head = new_node;
        } else {
            new_node = new Node(value, null, tail);
            tail.setNext(new_node);
        }
        tail = new_node;
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public Object peek() {
        return head == null ? null : head.getValue(); //
    }

    public Object poll() {
        if (head != null) {
            Node node = head;
            if (head.getNext() != null) {
                head.getNext().setPrevious(null);
            }
            head = head.getNext();
            return node.getValue();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (head != null) {
            Node new_node = head;
            while (new_node != null) {
                result.append(new_node.getValue().toString());
                if (new_node.getNext() != null) {
                    result.append(",");
                }
                new_node = new_node.getNext();
            }
        } else {
            result.append("empty");
        }
        return result.toString();
    }

    private static class Node {
        private Object value;
        private Node next;
        private Node previous;

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node(Object value, Node next, Node tail) { // // конструктор нам потрібен, щоб создати обєкт.
            this.value = value;
            this.next = next;
            this.previous = tail;
        }

    }

}
