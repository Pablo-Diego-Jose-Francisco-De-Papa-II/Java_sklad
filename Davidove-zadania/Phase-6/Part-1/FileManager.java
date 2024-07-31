package DavitZadania.Zadanie6;


import java.io.*;
import java.util.Scanner;

public class FileManager {
    private static File file;


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do: ");

            switch (input.nextLine()) {
                case "open", "o" -> {
                    System.out.println("Choose file to open: ");
                    FileManager.openAndGetFile(input.nextLine());
                }
                case "create", "c" -> {
                    System.out.println("What should the file be named: ");
                    FileManager.createAndGetFile(input.nextLine());
                }
                case "write", "w" -> {
                    FileManager what = new FileManager(file);
                    System.out.println("What would you like to write: ");
                    what.write(input.nextLine());
                }
                case "writeAll", "wa" -> {//todo
                    continue;
                }
                case "read", "r" -> {//todo
                    continue;
                }
                case "readAll", "ra" -> {//todo
                    continue;
                }
                case "end", "e" -> {
                    return;
                }
            }
        }
    }

    public static FileManager openAndGetFile(String fileName) {
        try {
            return new FileManager(new File(fileName).getAbsoluteFile());

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static FileManager createAndGetFile(String fileName) {
        File newFile = null;

        try {
            newFile = new File(fileName);
            newFile.createNewFile();

            return new FileManager(file);

        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public FileManager(File file) {
        this.file = file;
    }

    public String write(String text) {
        try {
            FileWriter txtWriter = new FileWriter(file);

            Scanner input = new Scanner(text);

            txtWriter.write(input.nextLine());
            txtWriter.close();
            return "file";

        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public String writeAll(String[] text) {
        return "";
    }

    public void readAll() {

    }

    public void read(int i) {

    }
}
