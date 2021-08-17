package com.comapny.factory;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<String> skills;

    public List<String> getSkills() {
        return skills;
    }

    public Person setSkills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    public Person(){}

    public Person(String skill) {
        this.skills = new ArrayList<>();
        this.skills.set(0, skill);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    private int age;

    public Person addSkill(String skill) {
        this.skills.add(skill);
        return this;
    }
}
