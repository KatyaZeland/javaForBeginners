import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("¬веди 5");
            value = scanner.nextInt();
        } while (value!=5);
        System.out.println("вы ввели 5");
        }
    }
