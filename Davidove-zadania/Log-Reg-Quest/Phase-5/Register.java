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
        HashMap<String, Clovek> user_data = new HashMap<>();

        while(true) {
            System.out.print("login or register? ");

            switch (input.next().toLowerCase()) {
                case "login", "l":
                    System.out.print("Enter your email: ");                                                 //input name
                    String log_mail = input.next();


                    if (user_data.containsKey(log_mail)) {                                                  //user found
                        System.out.print("Enter your password: ");                                          //input pass
                        String log_pass = input.next();

                        String pass = String.valueOf(user_data.get(log_mail));

                        if (pass.equals(log_pass)) {
                            System.out.println("You successfully logged in!");
                            return;

                        } else {
                            System.out.println("INCORRECT PASSWORD");
                        }

                    } else {                                                                            //user not found
                        System.out.println("USER WITH THIS EMAIL WAS NOT FOUND");                                //error
                    }
                    break;


                case "register", "r":
                    System.out.print("Enter a new email address: ");
                    String reg_mail = input.next();
                    Matcher matcher = pattern.matcher(reg_mail);

                    if (!matcher.matches()) {
                        System.out.println("INVALID EMAIL ADDRESS");
                        break;
                    }

                    if (user_data.containsKey(reg_mail)) {
                        System.out.println("EMAIL ALREADY IN USE");
                        break;
                    }

                    System.out.print("Enter a password, name and birth date: ");
                    String userInput = input.next();
                    String[] userData = userInput.split(",");

                    if (userData.length != 3) {
                        System.out.println("ENTER ALL DATA NEXT TIME");
                        break;
                    }

                    String reg_password = userData[0].trim();
                    String reg_name = userData[1].trim();
                    int reg_birthDate;

                    try {
                        reg_birthDate = Integer.parseInt(userData[2]);
                    } catch (Exception e) {
                        System.out.println("INVALID YEAR");
                        break;
                    }


                    Clovek clovek = new Clovek(reg_password, reg_name, reg_birthDate);
                    System.out.println(clovek);

                    user_data.put(reg_mail, clovek);
                    break;


                default:
                    System.out.println("UNKNOWN COMMAND");
            }
        }
    }
}
