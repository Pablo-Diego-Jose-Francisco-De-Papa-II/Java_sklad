import java.util.Random;
import java.util.Scanner;

public class October_4th_2023 {
	public static void main(String[] args) throws java.io.IOException {
            /*int[] pole = {5, 4, 2, 8, 3, 8};

            System.out.println(pole[0] + ", " + 
                               pole[1] + ", " + 
                               pole[2] + ", " + 
                               pole[3] + ", " + 
                               pole[4] + ", " + 
                               pole[5]);

            for (int i = 0; i < pole.length; i++) {
                System.out.print(pole[i] + ", ");
            }

            System.out.print("\nDlzka arrayu je " + pole.length + " znakov.");


            //Cvicenie 2:

            int[] pole = new int[15];

            Random rd = new Random();

            for (int x = 0; x < pole.length; x++) {
                pole[x] = rd.nextInt(50);
            }

            for (int i = 0; i < pole.length; i++) {
                System.out.print(pole[i] + ", ");
        }*/

        //Cvicenie 3:
        

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of items in array: ");

        Random rd = new Random();

        int[] velkost = input.nextInt();
        int[] pole = new int[15];


        for (int x = 0; x < pole.length; x++) {
            pole[x] = rd.nextInt(50);

        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + ", ");
        }

        System.out.println("\nHodnota 1st prvku je " + pole[0]);
        System.out.println("\nHodnota of last prvku je " + pole[-1]);
        //nechce sa mi to robit
        }
    }
}
