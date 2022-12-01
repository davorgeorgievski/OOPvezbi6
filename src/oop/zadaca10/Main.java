package oop.zadaca10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("F");
        l1.add("I");
        List<String> l2 = new ArrayList<String>();
        l2.add("K");
        l2.add("T");

        l1.addAll(l2);

        System.out.println(l1);
    }
}