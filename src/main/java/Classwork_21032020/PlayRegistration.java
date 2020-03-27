package Classwork_21032020;

public class PlayRegistration {
    public static void main (String[] args){
        System.out.println("Новый игрок! Пожалуйста зарегистрируйтесь...");
        String userName = "";
        do{
            userName = UserRegistration.regName();
           } while (!UserRegistration.chekName(userName));
        User user = new User(userName);
        user.helloUser();
        Game.choiceGame();

       }
}
