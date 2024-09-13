package Zadanie4;


import java.util.Scanner;
import java.util.ArrayList;

public class RegisterLudi {
    static ArrayList<Clovek> register = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your age: ");
            int age = Integer.parseInt(input.nextLine());

            register.add(new Clovek(name, age));

            System.out.println("Wanna see all registered users (yes/no) or end?: ");
            switch (input.nextLine().toLowerCase()) {
                case "yes", "y" -> printRegister();
                case "end", "e" -> { return; }
            }
        }
    }

    static void printRegister() {
        for (Clovek atri : register) {
            System.out.println(atri.name + " " + atri.age);
        }
    }
}
