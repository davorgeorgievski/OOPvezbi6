package oop.zadaca5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(18);
        lista.add(125);
        lista.add(834);
        lista.add(2);

        System.out.println("Vtoriot element e: "+lista.get(1));
    }
}