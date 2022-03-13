package com.company;


public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;


    public String getNAme() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Pet() {
        this.setName("unknown");
        this.setAge(0);
        this.setLocation("unknown");
        this.type = "unknown";
    }


    public Pet(String name, int age, String location, String type) {
        this.setName(name);
        this.setAge(age);
        this.setLocation(location);
        this.type = type;
    }


    public Object getName() {
        return null;
    }
}

