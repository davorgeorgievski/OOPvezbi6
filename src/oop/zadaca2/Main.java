package oop.zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Makedonija");
        lista.add("Srbija");
        lista.add("Crna Gora");
        lista.add("Hravtska");
        lista.add("Bosna i Hercegovina");

        System.out.println("Listata sodrzhi "+ lista.size()+" elementi.");

        if(lista.size() == 3) {
            lista.add("Slovenija");
            lista.add("Slovacka");

            System.out.println(lista);
        }
        else {
            System.out.println(lista);
        }
    }
}