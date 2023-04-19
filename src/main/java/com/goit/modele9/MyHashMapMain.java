package com.goit.modele9;

public class MyHashMapMain {
    public static void main(String[] args) {

        MyHashMap hash_map = new MyHashMap();

        hash_map.put(10, "Geeks");
        hash_map.put(11, "Peck");
        hash_map.put(16, "Shmek");
        hash_map.put(32, "Sek");
        hash_map.put(48, "Timur");

        System.out.println("New map is: " + hash_map);
        hash_map.put(32, "Sek1");
        System.out.println("New map is: " + hash_map);


    }
}
