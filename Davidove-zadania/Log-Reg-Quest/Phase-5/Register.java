/*Uloha:
Prepis prvotny program (teda program pre registraciu uzivatelov) s tym, ze kazdy clovek bude samotny objekt classy Clovek.
Kazdia instancia cloveka bude mat v sebe ulozene: meno osoby, heslo, datum narodenia (staci rok ig), mail.
(mozete vytvarat pri inicializacii, idc) Registrovanych uzivatelov ukladajte do register/login classy a najlepsie do
HashMapy s K: email, V: instancia osoby.
*/

package DavitZadania.Zadanie5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String regexPattern = "\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+";
        Pattern pattern = Pattern.compile(regexPattern);
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
                    Matcher matcher = pattern.matcher(regMail);

                    if (!matcher.matches()) {
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
