import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Alberto Martínez","bm.12@hotmail.com");
        myDoctor.addAvailableAppointment(new Date(),"4pm");

        //System.out.println(myDoctor.getAvailableAppointments());

        /*for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        System.out.println(myDoctor);

        Patient patient = new Patient("Andres Vesga", "bm.12@hotmail.com");
        patient.setWeight(83.1);
        //System.out.println(patient);

        //showMenu();
    }
}
