package com.pluralsight;
import java.util.List;
import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        * created a list, specified it's a string
        * called it fruits
        * initialized the empty array
        * */
        List<String> fruits = new ArrayList<>();

        /*
        * added strings to the array(populated the array)
        * */
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("banana");
        fruits.add("plum");
        fruits.add("melon");
        fruits.add("pair");
        fruits.add("grapes");
        fruits.add("orange");
        fruits.add("guava");
        fruits.add("lychee");

        /*
        * system advised using logs so I did
        * printed list
        *
        * */
        System.out.println(fruits);
    }
}
