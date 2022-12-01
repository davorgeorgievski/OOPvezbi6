package oop.zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fakultet> lista = new ArrayList<Fakultet>();

        Fakultet f =  new Fakultet("FIKT",2,900);
        lista.add(f);
        lista.add(new Fakultet("FINKI", 5, 1300));
        lista.add(new Fakultet("TFB", 8, 950));
        lista.add(new Fakultet("PMF", 4, 1050));
        lista.add(new Fakultet("FTU", 3, 200));

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getIme());
            System.out.println(lista.get(i).getBrojSmerovi());
            System.out.println(lista.get(i).getVkupnoStudenti());
        }
    }
}