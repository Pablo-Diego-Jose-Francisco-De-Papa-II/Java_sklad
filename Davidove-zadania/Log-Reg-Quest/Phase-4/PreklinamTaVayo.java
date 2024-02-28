import java.util.Scanner;

/*  Stvrta uloha:

    Uloha:
    Vasou ulohou bude vytvorit Classu Clovek s constructorom a pri inicializacii bude treba nacitat
    (string) meno a (int) vek, ktory nasledne aj ulozite. Vytvorite aj Classu RegisterLudi kde
    inicializujete par ludi a vypisete do konzole ich meno a vek...
*/

public class PreklinamTaVayo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Clovek data = new Clovek(input.nextLine(),input.nextInt());
            System.out.println(data.name + " " + data.age);
        }
    }
}
