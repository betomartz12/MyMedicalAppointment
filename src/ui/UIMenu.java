package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Choose an option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alberto Martinez","alberto@mail.com"));
        patients.add(new Patient("Roberto Rodriguez","roberto@mail.com"));
        patients.add(new Patient("Carlos Sanchez","carlos@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [example@email.com]");
            Scanner sc = new Scanner((System.in));
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }else if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while (!emailCorrect);
    }

}
