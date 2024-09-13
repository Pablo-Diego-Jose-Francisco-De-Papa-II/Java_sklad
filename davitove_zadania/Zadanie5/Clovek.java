package Zadanie5;

public class Clovek {
    String password;
    String name;
    int birthDate;

    public Clovek(String password, String name, int birthDate) {
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Your name is " + name + " and you were born in " + birthDate + "!";
    }
}
