import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value= scanner.nextInt();
        while (value!=5) {
            System.out.println("¬веди 5");
            value = scanner.nextInt();
        }
        System.out.println("вы ввели 5");
        }
    }
