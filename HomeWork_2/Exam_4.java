package HomeWork_2;

import java.util.Scanner;

public class Exam_4 {
    public static void main(String[] args) {
        try {
            System.out.printf("\"%s\"", InputData());
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String InputData() throws EmptyStringException {
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        data = scanner.nextLine();
        scanner.close();
        if (data.isEmpty())
            throw new EmptyStringException("Empty string!");
        return data;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}