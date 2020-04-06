package util;

import java.util.Scanner;

public class UserInput {

    public static double inputDouble(String msg, boolean trueNull) {
        Scanner scanner = new Scanner(System.in);

        double value;

        while (true) {
            System.out.println(msg);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (trueNull || value != 0) {
                    break;
                } else {
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
            }
        }
        return value;
    }
}
