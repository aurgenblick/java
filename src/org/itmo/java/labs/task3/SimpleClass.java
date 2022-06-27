package org.itmo.java.labs.task3;

public class SimpleClass {

    String colour;
    String name;
    Double weight;

    public String printInfo() {
        return new String("colour: "+colour+", name: "+name+", weight: "+weight);

    }

    public void setColour(String c) {
        this.colour = c;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setWeight(Double w) {
        this.weight = w;
    }

    public static void main(String[] args) {
        //Создание двух объектов (sc1 и sc2) класса SimpleClass
        SimpleClass sc1 = new SimpleClass();
        sc1.setColour("RED");
        sc1.setName("first");
        sc1.setWeight(12.5);
        SimpleClass sc2 = new SimpleClass();
        sc2.setColour("GRAY");
        sc2.setName("second");
        sc2.setWeight(11.3);
        //Обращение к методу printInfo для вывода значений полей созданных объектов
        System.out.println(sc1.printInfo());
        System.out.println(sc2.printInfo());
    }

    //Конструктор, устанавливающий только цвет
    public SimpleClass(String c) {
        this.colour = c;
    }

    //Конструктор, устанавливающий цвет и вес
    public SimpleClass(String c, Double w) {
        this.colour = c;
        this.weight = w;
    }

    //Пустой конструктор
    public SimpleClass(){}
}

