package com.designpatterns.datastructure;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, Integer> map = new CustomHashMap<>();

        map.put(21, 12);
        map.put(25, 121);
        map.put(30, 3);
        map.put(62, 3);
        map.put(94, 3);
        map.put(33, 15);
        map.put(35, 89);
        map.put(35, 811);
        map.display();

        System.out.println(map.get(21) + " " +  map.get(25) + " " + map.get(30) + " " + map.get(62));

        map.remove(30);

        map.display();

    }
}
