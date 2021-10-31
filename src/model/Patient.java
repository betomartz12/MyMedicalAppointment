package model;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

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
}
