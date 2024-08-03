package DavitZadania.Zadanie6;


import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileManager {
    private static File file;
    private static FileReader txtReader;
    private static FileWriter txtWriter;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileManager fileHandler = new FileManager(file);

        while (true) {
            System.out.println("What would you like to do: ");

            switch (input.nextLine().toLowerCase()) {
                case "open", "o" -> {
                    System.out.println("Choose file to open: ");
                    FileManager.openAndGetFile(input.next());
                }
                case "create", "c" -> {
                    System.out.println("What should the file be named: ");
                    FileManager.createAndGetFile(input.next());
                }
                case "write", "w" -> {
                    System.out.println("What would you like to write: ");
                    fileHandler.write(input.nextLine());
                }
                case "writeall", "wa" -> {
                    System.out.println("What would you like to write: ");
                    fileHandler.writeAll(input.nextLine().split(","));
                }
                case "read", "r" -> {
                    System.out.println("What line you want to read: ");
                    System.out.println(fileHandler.read(input.nextInt()));
                }
                case "readall", "ra" -> {
                    for (String line : fileHandler.readAll()) {
                        System.out.println(line);
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

        try {
            this.txtReader = new FileReader(file);
            this.txtWriter = new FileWriter(file);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static FileManager openAndGetFile(String fileName) {
        return new FileManager(new File(fileName));
    }

    public static FileManager createAndGetFile(String fileName) {
        File newFile;

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
            Scanner input = new Scanner(text);

            txtWriter.write(input.nextLine());
            txtWriter.close();

            return true;

        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean writeAll(String[] text) {
        try {
            for (String idk : text) {
                txtWriter.write(idk);
            }
            txtWriter.close();

            return true;

        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public String read(int t) {
        Scanner file = new Scanner(txtReader);
        String targetLine = "";

        for (int i = 1; i <= t; i++) {
            targetLine = file.nextLine();
        }

        return targetLine;
    }

    public String[] readAll() {
        Scanner file = new Scanner(txtReader);
        String targetLine;
        ArrayList<String> al = new ArrayList<String>();
        
        while (file.hasNextLine()) {
            al.add(file.nextLine());
        }

        return al.toArray(new String[0]);
    }
}
