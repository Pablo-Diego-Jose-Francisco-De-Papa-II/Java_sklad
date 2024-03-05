import java.util.ArrayList;


public class RegisterLudi {
    static ArrayList<Clovek> peopleDetails = new ArrayList<>();

    public static void registerPerson(Clovek clovek) {
        peopleDetails.add(clovek);
    }

    public void printAllPeople() {
        for (Clovek person : peopleDetails) {
            System.out.print(person + " ");
        }
    }
}
