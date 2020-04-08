package by.nc.khoroneko.util;

import by.nc.khoroneko.view.Printer;

import java.util.Scanner;

public class UserInput {

    public double inputDouble(String msg) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();

        double value;

        while (true) {
            printer.printString(msg);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return value;
    }
}
