import javax.lang.model.type.ArrayType;
import java.sql.SQLOutput;
import java.util.ArrayList; //import the arrayList class
import java.util.Scanner;
/*
    Program written by Soren Long
 */

public class Main {

    static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {

        //Default values, can leave blank or remove
        planets.add(0, "Mars");
        planets.add(1, "Jupiter");
        planets.add(2, "Earth");
        planets.add(3, "Venus");
        planets.add(4, "Neptune");
        planets.add(5, "Saturn");
        boolean isactive = true;
        while (isactive ==true) {
            //main menu
            System.out.println("Choose your favorite planets with this program. This program edits arrays, please choose an array position to edit [0,1,2,3]");
            System.out.println("1. Print Array");
            System.out.println("2. Edit Array");
            System.out.println("3. Add to array");
            System.out.println("4. Exit the program");

            //menu scanner
            Scanner scn = new Scanner(System.in);
            int MenuOption = scn.nextInt(); //Scan result

            if (MenuOption == 1) {
                System.out.println(planets);
            }

            if (MenuOption == 2) {
                //values
                System.out.println("Please choose which element to edit");
                System.out.println("0");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                System.out.println("Press 9 to exit");


                //change  values
                Scanner editMenu = new Scanner(System.in);
                int editMenuOption = editMenu.nextInt();
                if (editMenuOption == 0) {
                    System.out.println("what would you like to change position 0 to");
                    Scanner posZeroScan = new Scanner(System.in);
                    String posZeroScanEdit = posZeroScan.next();
                    planets.add(0, posZeroScanEdit);
                    System.out.println(planets);
                    main(null);

                }

                if (editMenuOption == 1) {
                    System.out.println("what would you like to change position 1 to");
                    Scanner posOneScan = new Scanner(System.in);
                    String posOneScanEdit = posOneScan.next();
                    planets.add(1, posOneScanEdit);
                    System.out.println(planets);
                    main(null);

                }

                if (editMenuOption == 2) {
                    System.out.println("what would you like to change position 2 to");
                    Scanner posTwoScan = new Scanner(System.in);
                    String posTwoScanEdit = posTwoScan.next();
                    planets.add(2, posTwoScanEdit);
                    System.out.println(planets);
                    main(null);

                }

                if (editMenuOption == 3) {
                    System.out.println("what would you like to change position 3 to");
                    Scanner posThreeScan = new Scanner(System.in);
                    String posThreeScanEdit = posThreeScan.next();
                    planets.add(3, posThreeScanEdit);
                    System.out.println(planets);
                    main(null);


                }

                if (editMenuOption == 4) {
                    System.out.println("what would you like to change position 4 to");
                    Scanner posFourScan = new Scanner(System.in);
                    String posFourScanEdit = posFourScan.next();
                    planets.add(4, posFourScanEdit);
                    System.out.println(planets);
                    main(null);


                }

                if (editMenuOption == 5) {
                    System.out.println("what would you like to change position 5 to");
                    Scanner posFiveScan = new Scanner(System.in);
                    String posFiveScanEdit = posFiveScan.next();
                    planets.add(5, posFiveScanEdit);
                    System.out.println(planets);
                    main(null);


                }

                if (editMenuOption == 6) {
                    System.out.println("what would you like to change position 6 to");
                    Scanner posSixScan = new Scanner(System.in);
                    String posSixScanEdit = posSixScan.next();
                    planets.add(6, posSixScanEdit);
                    System.out.println(planets);
                    main(null);


                }

                if (editMenuOption == 7) {
                    System.out.println("what would you like to change position 7 to");
                    Scanner posSevenScan = new Scanner(System.in);
                    String posSevenScanEdit = posSevenScan.next();
                    planets.add(7, posSevenScanEdit);
                    System.out.println(planets);
                    main(null);


                } else {
                    System.exit(1);
                }

            }

            if (MenuOption == 3) {
                System.out.println("What would you like to add");
                Scanner add = new Scanner(System.in);
                String addRes = add.next();
                planets.add(addRes);
                System.out.println(planets);


            }

            //exit
            if (MenuOption == 4) {
                System.out.println("Thanks for checking out my program!");
                System.exit(0);
            }

        }
    }
}