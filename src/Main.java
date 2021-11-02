import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Alberto Martínez","bm.12@hotmail.com");
        myDoctor.addAvailableAppointment(new Date(),"4pm");

        //Instanciando User desde clases hijas
        User userD = new Doctor("Martz","martz@martz.com");
        userD.showDataUser();

        User userP = new Patient("Martz","martz@martz.com");
        userP.showDataUser();

        //Instanciando anonimamente

        User user1 = new User("Beto","beto@beto.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor externo");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

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
