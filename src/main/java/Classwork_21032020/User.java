package Classwork_21032020;

public class User {
    private String name;
    public User (String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public void helloUser(){
        name = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("<-------------------------------------------------->");
        System.out.println("Здравствуйте " + name);
        System.out.println("Вас претствует Jumanji)))");
        System.out.println("<-------------------------------------------------->");
        System.out.println("В какую игру Вы хотите сыграть? В <Угадать число> или <Загадать число>?");
    }
    }
