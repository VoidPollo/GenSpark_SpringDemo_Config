package org.genspark;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Phone> ph;
    private Address add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Student(String name, int id, List<Phone> ph, Address add) {
        this.name = name;
        this.id = id;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
