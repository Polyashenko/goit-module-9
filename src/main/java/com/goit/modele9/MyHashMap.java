package com.goit.modele9;

public class MyHashMap {

    Node[] table = new Node[16];
    private int modCount;
    private int size;

    static int indexFor(int hash, int length) {  //int length - длина масива.
        return Math.abs(hash) % length;
    }

    public Object put(Object key, Object value) { //додає пару ключ + значення
        int hash = key.hashCode(); //Визиваем у ключа функцию hashCode и записываем в переменную.
        int i = indexFor(hash, table.length); // розрахували номер баккета. 16 масивів (зберігаються лінкід лист) розроховуем в який елемент масиву кладемо обєкт
        Node node = table[i]; // Достаем
        if (node == null) {
            node = new Node(key, value, null);
            table[i] = node;
            size++;
            return value;
        } else {
            while (node.getNext() != null) {
                if (node.getKey().hashCode() == hash && node.getKey().equals(key)) { // Если два ключа hash коди совпадают, проверяем по equals
                    node.setKey(key);
                    node.setValue(value);
                    return value;
                }
                node = node.getNext(); // Если не одинаковое значание продолжаем поиск последнего елемента
            }
            Node newNode = new Node(key, value, null); // созадем новую ноду
            node.setNext(newNode); // записываем новую ноду.
            size++;
        }
        return value;
    }


    public Object remove(Object key) { //видаляє пару за ключем
        // вычисляем индекс элемента с учетом размера таблицы
        int i = indexFor(key.hashCode(), table.length);
        Node node = table[i]; // Достаем
        // идем по списку из заданной ячейки и ищем удаляемый элемент
        Node prev = node;
        while (node != null) {
            /* сначала сравниваем хеш-коды, потому что это бысрее, чем equals */
            if (node.getKey().hashCode() == key.hashCode() && key.equals(node.getKey())) {
                if(node == table[i]) {
                    if(node.getNext() == null) {
                        table[i] = null;
                    } else {
                        table[i] = node.getNext();
                    }
                } else {
                    prev.setNext(node.getNext());
                }
                size--;
                return node.getValue();
            }
            prev = node;
            node = node.getNext();
        }
        return null;
    }


    public void clear() {
        table = new Node[16];
    }


    static class Node {
        private Object key;
        private Object value;
        private Node next;


        public Node(Object key, Object value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
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
