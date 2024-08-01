package DavitZadania.Zadanie6;


import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileManager {
    private static File file;


    public static void main(String[] args) {
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
                case "writeAll", "wa" -> {
                    FileManager what = new FileManager(file);
                    System.out.println("What would you like to write: ");
                    what.writeAll(new String[]{});
                }
                case "read", "r" -> {
                    FileManager what = new FileManager(file);
                    System.out.println("What line you want to read: ");
                    System.out.println(what.read(input.nextInt()));
                }
                case "readAll", "ra" -> {
                    FileManager what = new FileManager(file);

                    for (String ble : what.readAll()) {
                        System.out.println(ble);
                    }
                }
                case "end", "e" -> {
                    return;
                }
            }
        }
    }

    public FileManager(File file) {
        this.file = file;
    }

    public static FileManager openAndGetFile(String fileName) {
        try {
            return new FileManager(new File(fileName));

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

    public boolean write(String text) {
        try {
            FileWriter txtWriter = new FileWriter(file);

            Scanner input = new Scanner(text);

            txtWriter.write(input.nextLine());
            txtWriter.close();
            return true;

        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public String writeAll(String[] text) {
        return "";
    }

    public String[] readAll() {
        String targetLine = "";
        ArrayList<String> cat = new ArrayList<String>();

        try {
            FileReader txtReader = new FileReader(file);
            Scanner file = new Scanner(txtReader);

            while (file.hasNextLine()) {
                cat.add(file.nextLine());
            }

            return cat.toArray(new String[0]);

        } catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }

    public String read(int y) {
        String targetLine = null;

        try {
            FileReader txtReader = new FileReader(file);
            Scanner file = new Scanner(txtReader);

            for (int x = 1; x <= y; x++) {
                targetLine = file.nextLine();
            }
            return targetLine;

        } catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }
}
