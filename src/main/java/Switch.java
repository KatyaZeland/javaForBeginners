import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch (age) {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "сем" :
                System.out.println("ты пошол в школу");
                break;
            case "восемнадцать":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни одно из придидущих условий не подошло");
        }
    }
}