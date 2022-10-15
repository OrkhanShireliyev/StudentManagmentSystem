package bean;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String surName;
    private String age;

    Person() {
    }

    Person(String name, String surName, String age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return name+" "+surName;
    }
}
