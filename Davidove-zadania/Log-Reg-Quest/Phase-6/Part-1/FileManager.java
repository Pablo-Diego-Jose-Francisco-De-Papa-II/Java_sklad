package DavitZadania.Zadanie6;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {
        File txtPath = new File("C:\\Users\\echni\\IdeaProjects\\JavaTheHutt\\src\\DavitZadania\\Zadanie6\\text.txt");
        FileWriter txtWriter = new FileWriter (txtPath);
        FileReader txtReader = new FileReader (txtPath);

        Scanner file = new Scanner(txtReader);
        Scanner input = new Scanner(System.in);


        txtWriter.write(input.nextLine());
        txtWriter.close();

        System.out.println(file.nextLine());
    }
}
