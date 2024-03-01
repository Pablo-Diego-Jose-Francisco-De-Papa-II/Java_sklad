import java.util.Scanner;

//Vytvorite aj Classu RegisterLudi kde inicializujete par ludi a vypisete do konzole ich meno a vek...

public class PreklinamTaVayo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your age: ");
            int age = Integer.parseInt(input.nextLine());

            Clovek clovek = new Clovek(name, age);
            System.out.println(clovek.name + " " + clovek.age);
        }
    }
}
