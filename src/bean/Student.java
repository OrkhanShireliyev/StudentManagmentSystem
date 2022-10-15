package bean;

public class Student extends Person{
    private String schoolName;
    private double scolarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScolarship() {
        return scolarship;
    }

    public void setScolarship(double scolarship) {
        this.scolarship = scolarship;
    }


}
