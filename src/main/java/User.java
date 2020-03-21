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
        System.out.println("Здравствуйте " + name);
        System.out.println("Вас претствует Jumanji)))");
    }
    }
