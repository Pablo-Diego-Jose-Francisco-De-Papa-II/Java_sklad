package DavitZadania.Zadanie6;


import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileManager {
    private File file;
    private FileWriter txtWriter;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileManager fileHandler = null;


        while (true) {
            System.out.println("What would you like to do: ");

            switch (input.nextLine().toLowerCase()) {
                case "open", "o" -> {
                    System.out.println("Choose file to open: ");
                    fileHandler = FileManager.openAndGetFile(input.nextLine());
                }
                case "create", "c" -> {
                    System.out.println("What should the file be named: ");
                    fileHandler = FileManager.createAndGetFile(input.nextLine());
                }
                case "write", "w" -> {
                    if (fileHandler != null) {
                        System.out.println("What would you like to write: ");
                        fileHandler.write(input.nextLine());
                    } else {
                        System.out.println("No file is open!");
                    }
                }
                case "writeall", "wa" -> {
                    if (fileHandler != null) {
                        System.out.println("What would you like to write: ");
                        fileHandler.writeAll(input.nextLine().split(","));
                    } else {
                        System.out.println("No file is open!");
                    }
                }
                case "read", "r" -> {
                    if (fileHandler != null) {
                        System.out.println("What line you want to read: ");
                        System.out.println(fileHandler.read(input.nextInt()));
                    } else {
                        System.out.println("No file is open!");
                    }
                    input.nextLine();
                }
                case "readall", "ra" -> {
                    if (fileHandler != null) {
                        for (String line : fileHandler.readAll()) {
                            System.out.println(line);
                        }
                    } else {
                        System.out.println("No file is open!");
                    }
                }
                case "end", "e" -> {
                    return;
                }
                default -> {
                    System.out.println("Unknown command!");
                }
            }
        }
    }

    public FileManager(File file) {
        this.file = file;

        try {
            txtWriter = new FileWriter(file, true);

        } catch (Exception e) {}
    }

    public static FileManager openAndGetFile(String fileName) {
        if (new File(fileName).exists()) {
            return new FileManager(new File(fileName));

        } else {
            return null;
        }
    }

    public static FileManager createAndGetFile(String fileName) {
        File newFile;

        try {
            newFile = new File(fileName);
            newFile.createNewFile();

            return new FileManager(newFile);

        } catch (IOException e) {
            return null;
        }
    }

    public boolean write(String text) {
        try {
            Scanner input = new Scanner(text);

            txtWriter.write(input.nextLine());
            txtWriter.flush();

            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public boolean writeAll(String[] text) {
        try {
            for (String idk : text) {
                txtWriter.write(idk);
            }
            txtWriter.flush();

            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public String read(int t) {
        String targetLine = "";

        try {
            Scanner f = new Scanner(file);
            for (int i = 1; i <= t; i++) {
                targetLine = f.nextLine();
            }

            return targetLine;

        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public String[] readAll() {
        String targetLine;
        ArrayList<String> al = new ArrayList<String>();

        try {
            Scanner f = new Scanner(file);
            while (f.hasNextLine()) {
                al.add(f.nextLine());
            }

            return al.toArray(new String[0]);

        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
