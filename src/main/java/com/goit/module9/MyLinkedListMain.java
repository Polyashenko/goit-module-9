package com.goit.module9;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list);
        list.add("New element0");
        list.add("New element1");
        list.add("New element2");
        list.add("New element3");
        list.add("New element4");
        list.add("New element5");
        list.add("New element6");
        list.add("New element7");
        list.add("New element8");
        list.add("New element9");

        System.out.println(list);

        System.out.println(list.get(6));

        list.remove(6);
        System.out.println(list);

        list.size();
        System.out.println(list);

        list.clear();
        System.out.println();



    }
}
