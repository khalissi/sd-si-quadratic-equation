package by.nc.khoroneko.view;

import java.util.List;

public class Printer {

    public void printString(String msg) {
        System.out.println(msg);
    }

    public <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }

    }
}
