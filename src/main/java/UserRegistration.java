import java.util.Scanner;

public class UserRegistration {
    public static boolean chekName (String name) {
        if (name.equals("")) {
            System.out.println("Имя не введено, попробуйте еще раз");
            return false;
        } else
           return true;
            }
        public static String regName(){
           System.out.println("Введите Ваше имя");
           return new Scanner(System.in).next();

        }

}
