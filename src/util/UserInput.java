package util;

import java.util.Scanner;

public class UserInput {

    public static int inputInt(String msg) {
        Scanner scanner = new Scanner(System.in);

        int value;

        while (true) {
            System.out.println(msg);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int inputIntNotNull(String msg) {
        Scanner scanner = new Scanner(System.in);

        int value;

        while (true) {
            System.out.println(msg);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value != 0){
                    break;
                }
                else{
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
            }
        }
        return value;
    }
}
