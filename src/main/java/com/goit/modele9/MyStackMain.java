package com.goit.modele9;

public class MyStackMain {

    public static void main(String[] args) {
        MyStack list = new MyStack();

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

        list.remove(3);
        System.out.println(list);

        list.size();
        System.out.println(list);

        list.peek().toString();
        System.out.println(list);

    }

}
