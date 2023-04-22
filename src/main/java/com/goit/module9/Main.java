package com.goit.module9;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

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

        System.out.println("Fourth element of the ArrayList: "+list.get(3));

        System.out.println();

        MyArrayList list1 = new MyArrayList();

    }
}
