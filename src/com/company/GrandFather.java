package com.company;

public class GrandFather {
    private final String name;
    private final int age;
    private final professionEnum profession;


    public GrandFather(String name, int age, professionEnum profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public professionEnum getProfession() {
        return profession;
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nProfession_Enum: " + getProfession() +
                "\nName: " + getName() ;
    }
}