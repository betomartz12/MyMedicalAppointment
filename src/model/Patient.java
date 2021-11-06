package model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String bloodType;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email){
        super(name,email);
    }

    public String getWeight(){

        return this.weight + "kg";
    }

    public void setWeight(double weight){

        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return this.height + "m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Birthday: " + birthday +
                "\nWeight:" + getWeight() +
                ", Height: " + getHeight() +
                ", BloodType: " + bloodType;
    }

    @Override
    public void showDataUser() {
        System.out.println("EPS: Sanitas");
    }
}
