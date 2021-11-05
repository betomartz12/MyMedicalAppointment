package ui;

import java.util.Scanner;

import static ui.UIMenu.showMenu;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println(":: Patient ::");
            System.out.println("Welcome "+UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: Book an appointment ::");
                    for (int i = 1; i < 13; i++) {
                        System.out.println(i + ". " + UIMenu.MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println(":: My appointments ::");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);


    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an appointment ::");
            System.out.println(":: Select date ::");
        }while (response != 0);
    }
}
