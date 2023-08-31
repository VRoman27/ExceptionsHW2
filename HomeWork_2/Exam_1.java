package HomeWork_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_1 {
    public static void main(String[] args) {
        System.out.println(Float.toString(InputFloat()));
    }

    public static float InputFloat() {
        float data = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            data = scanner.nextFloat();
            scanner.close();
            return data;
        } catch (InputMismatchException e) {
            System.out.println("It's not a number!");
            return InputFloat();
        }
    }
}
