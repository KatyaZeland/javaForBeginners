public class Arrays_of_Strings {
    public static void main(String[] args) {


       String[]  strings = new String[3];
       strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";

        for (int i =0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}