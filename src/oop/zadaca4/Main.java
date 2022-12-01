package oop.zadaca4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(12);
        lista.add(625);
        lista.add(125);
        lista.add(25);

        Collections.sort(lista);

        System.out.println(lista);
    }
}