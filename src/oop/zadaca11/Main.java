package oop.zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> l1 =  new ArrayList<String>();
        l1.add("F");
        l1.add("I");
        l1.add("K");
        l1.add("T");
        l1.add("P");
        List<String> l2 = new ArrayList<String>();
        l2.add("F");
        l2.add("I");
        l2.add("K");
        l2.add("T");
        l1.add("M");
        l1.retainAll(l2);

        System.out.println(l1);
    }
}