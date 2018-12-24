package com.gmail.wiaripost.mylearning.Learning8;

public class Writers {
    private String name;
    private int id;

    public Writers(String  name, int id) {
//        System.out.println("Вызван конструктор");
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "[ Писатель " + name +
                ", id = " + id +
//                ", Owner=" + owner +
//                ", age=" + age +
//                ", name =  " + name + '\'' +
                " ]";
    }
}


