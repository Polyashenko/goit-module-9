package com.goit.modele9;

public class MyStack {

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


    private Node getNode(int index) { // Пошук Node за індексом
        if (index >= size) { //якщо index >= количество ячеек то в нас елементів немає
            return null;
        }
        //ведем перебор с начала списка
        Node node = head;
        for (int j = 0; j < index; j++) {
            //сдвигаемся на следующий элемент списка
            node = node.getNext();
        }
        return node;
    }

    public void remove(int index) {
        Node node = getNode(index); // Node - це тип змінної - Визиваем метод getNode, передаем в метод індекс який
        // повертає обєкт типа Node і ми записуем його в переменную node.
        if (node != null) { //
            if (node == head) { // чи нода являеться head, якщо так то наша node і є head
                head.getNext().setPrevious(null); // першим елементов робивм настуний і переведущий елемент робоми null
                head = head.getNext(); //
            } else if (node == tail) {
                tail.getPrevious().setNext(null); // попереднім елемен робим робим наступним і останній null
                tail = tail.getPrevious();
            } else {
                node.getNext().setPrevious(node.getPrevious()); // наприклад якщо видаляем 4ти елемент то 3три стае 4м
                node.getPrevious().setNext(node.getNext()); //
            }
        }
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
        return tail == null ? null : tail.getValue(); //
    }

    public Object pop() {
        if (tail != null) {
            Node node = tail;
            if (tail.getNext() != null) {
                tail.getNext().setPrevious(null);
            }
            tail = tail.getNext();
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
