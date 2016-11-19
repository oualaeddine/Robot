package ntic.berrehal.oualaeddine.robot.das;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by berre on 11/18/2016.
 */

public class Test {

    static int choice;
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Robot> robots = new LinkedList();
    public static void main(String args[]) {
        menu_1();
    }

    public static void menu_1() {
        int p = 0;
        String error_input = "mauvais choix -__-",
                menu_1 = "Veillez choisir une action:\n1.Creer un nouveau robot.\t2.afficher les robots existants.\n3.Sortir du programme.",
                menu_2;


        while (p == 0) {
            choice = 0;
            try {

                System.out.println(menu_1);
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        createNewRobot();
                        break;
                    }
                    case 2: {
                        afficherRobots();
                        break;
                    }
                    case 3:{

                    }
                    default: {
                        System.out.println(error_input);
                        break;
                    }
                }
            } catch (Exception exeptions) {
                System.out.println(error_input);
            }
        }
    }
    public static void createNewRobot(){
        System.out.println("entrez le nom du nouveau robot");
        String robotName = scanner.nextLine();

        for (Robot robot:robots)
            if (robot.nom == robotName) {
                System.out.println("robot deja existant!");
                createNewRobot();
            } else {

                System.out.println("choisissez le type de robot:\n1.Robot autonome\t2.Robot Programme\n3.Robot Energivore");
                choice = scanner.nextInt();
                Robot newRobot;
                switch (choice) {
                    case 1: {
                        newRobot = new RobotAutonome(robotName);
                        robots.add(newRobot);
                        break;
                    }
                    case 2: {
                        newRobot = new RobotProgramme();
                        robots.add(newRobot);
                        break;
                    }
                    case 3: {
                        newRobot = new RobotEnergivore();
                        robots.add(newRobot);
                        break;
                    }
                    default: {
                        System.out.println("Wrong choice! Robot not added!");
                    }
                }
            }
    }

    public static void afficherRobots(){

    }

}
