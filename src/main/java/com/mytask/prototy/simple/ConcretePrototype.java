package com.mytask.prototy.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.simple
 * 文件名:ConcretePrototype
 * description:
 *
 * @author lcwen
 * @version V1.0: ConcretePrototype.java 2019/10/11 9:17
 **/
public class ConcretePrototype implements Prototype{

    private String name;
    private int age;
    private List hobbies;

    public Prototype clone() {
        ConcretePrototype pt = new ConcretePrototype();
        pt.setAge(this.age);
        pt.setName(this.name);
        pt.setHobbies(this.hobbies);
        return pt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }



}
