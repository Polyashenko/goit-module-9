package com.goit.modele9;

import java.util.Arrays;

public class MyArrayList {
    private Object[] arr = new Object[0]; //

    public void add(Object value) { // создаем метод в котором будем добавлять елемент.
        Object[] result = new Object[arr.length + 1]; // cоздаем новий масив на 1 елемент больше
        for (int i = 0; i < arr.length; i++) { // проходим по всем елементов преведущего масива
            result[i] = arr[i]; //перезаписуемо елементи зі старого масива в новий
        }
        result[result.length - 1] = value; // записваем новое значение (которое в методе add) в последнюю ячейку.
        arr = result; // перезаписуем в сиилку новий масив.
    }

    public void remove(int index) {
        Object[] result = new Object[arr.length - 1]; //cоздаем новий масив на 1 елемент меньше
        int j = 0; // создали счетчик для result.
        for (int i = 0; i < arr.length; i++) { //проходим по всем елементов преведущего масива
            if (i != index) { // пройдет условия для всех, кроме указаного индекса
                result[j] = arr[i]; // со страрого перекладываем в новый справа на лево
                j++; // и увеличиваем индекс для работи с новим масивом.
            }
        }
        arr = result; // заминили масив в состояние класса на новий/перезаписуем в сиилку новий масив.
    }


    public void clear() {
        arr = new Object[0]; // в состояние класса заменили на пустой масив.
    }

    public int size() { // провіреть всі методи в maine
        return arr.length;
    }

    public Object get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

}
