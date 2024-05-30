/**
 * @author Kovtun D.A.
 * @see
 */

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args input value
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе дробное число ");
        float b = scanner.nextFloat();
        System.out.printf("a + b = %.4f",a+b);
    }

}