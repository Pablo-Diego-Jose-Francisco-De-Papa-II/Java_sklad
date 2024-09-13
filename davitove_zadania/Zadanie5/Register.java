package Zadanie5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Register {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pattern EMAIL_PATTERN = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+");
        HashMap<String, Clovek> savedUsers = new HashMap<>();

        while(true) {
            System.out.print("login or register? ");

            switch (input.next().toLowerCase()) {
                case "login", "l" -> {
                    System.out.print("Enter your email: ");
                    String logMail = input.next();

                    if (savedUsers.containsKey(logMail)) {
                        System.out.print("Enter your password: ");
                        String logPass = input.next();

                        String pass = savedUsers.get(logMail).password;

                        if (pass.equals(logPass)) {
                            System.out.println("You successfully logged in!");
                            System.out.println(savedUsers.get(logMail));
                            return;

                        } else {
                            System.out.println("INCORRECT PASSWORD");
                        }

                    } else {
                        System.out.println("USER WITH THIS EMAIL WAS NOT FOUND");
                    }
                }

                case "register", "r" -> {
                    System.out.print("Enter a new email address: ");
                    String regMail = input.next();

                    if (EMAIL_PATTERN.matcher(regMail).matches()) {
                        System.out.println("INVALID EMAIL ADDRESS");
                        break;
                    }

                    if (savedUsers.containsKey(regMail)) {
                        System.out.println("EMAIL ALREADY IN USE");
                        break;
                    }

                    System.out.print("Enter a password, name and birth date: ");
                    String userInput = input.next();
                    String[] userData = userInput.split("[, ]+");

                    if (userData.length != 3) {
                        System.out.println("ENTER ALL DATA NEXT TIME");
                        break;
                    }

                    int reg_birthDate;

                    try {
                        reg_birthDate = Integer.parseInt(userData[2]);
                    } catch (Exception e) {
                        System.out.println("INVALID YEAR");
                        break;
                    }

                    Clovek clovek = new Clovek(userData[0].trim(), userData[1].trim(), reg_birthDate);
                    savedUsers.put(regMail, clovek);
                }

                default -> {
                    System.out.println("UNKNOWN COMMAND");
                }
            }
        }
    }
}
