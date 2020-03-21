public class PlayRegistration {
    public static void main (String[] args){
        System.out.println("Пожалуйста зарегистрируйтесь...");
        String name;
        do{
            name = UserRegistration.regName();
           } while (!UserRegistration.chekName(name));
        User user = new User(name);
        user.helloUser();
       }
}
