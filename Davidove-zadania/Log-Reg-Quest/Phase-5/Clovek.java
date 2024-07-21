package DavitZadania.Zadanie5;

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
        return "password = " + password + ", name = " + name + ", birthDate = " + birthDate;
    }
}
