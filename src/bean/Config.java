package bean;

import util.FileUtility;

import java.io.Serializable;

public class Config implements Serializable {
    private static Config config=null;
    private static final String fileName="app.obj";
    private Student[]students=new Student[0];
    private Teacher[]teachers=new Teacher[0];
    private static boolean loggedIn;

    public static void initializa() {
       Object obj=FileUtility.readFileDeserialize(fileName);
       if (obj==null){
           return;
       }
       if (obj instanceof Config){
           config=(Config) obj;
       }
    }
    public static void save(){
        FileUtility.writeObjectToFile(Config.instance(), fileName);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    public void appendStudent(Student s){//append yani elave ele studente
        Student[] newStudents=new Student[students.length+1];//herdefe append deyende kohne massivin lengthin goturub ustune bir gelib yeni massive menimsedir

        for (int i=0;i< students.length;i++){//kohnenin elementlerini teze massive otuzdurur
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=s;//teze massivinin en sonuncu elementlerine bu s-i set eliyir
        students=newStudents;//burdada studentse yeni massivi otuzdurur


    }
    public void appendTeacher(Teacher t){//append yani elave ele teachers
        Teacher[] newTeacher=new Teacher[teachers.length+1];//herdefe append deyende kohne massivin lengthin goturub ustune bir gelib yeni massive menimsedir

        for (int i=0;i< students.length;i++){//kohnenin elementlerini teze massive otuzdurur
            newTeacher[i]=teachers[i];
        }
        newTeacher[newTeacher.length-1]=t;//teze massivinin en sonuncu elementlerine bu s-i set eliyir
        teachers=newTeacher;//burdada teachers yeni massivi otuzdurur


    }
    public static Config instance(){//singleton pattern
        if (config==null){
            config=new Config();
        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
}
