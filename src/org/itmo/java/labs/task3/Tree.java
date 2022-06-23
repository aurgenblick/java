package org.itmo.java.labs.task3;

public class Tree {
    //Добавление полей: возраст, живое ли дерево, название дерева
    Integer treeAge;
    Boolean isAlive;
    String treeName;

    //Конструктор, который устанавливает только возраст и название
    public Tree(Integer a, String n) {
        this.treeAge = a;
        this.treeName = n;
        System.out.println("Это дерево - " + n + ", ему " + a + " лет.");
    }

    //Конструктор, который устанавливает все переменные в классе;
    public Tree(Integer a, Boolean i, String n) {
        this.treeAge = a;
        this.isAlive = i;
        this.treeName = n;
        if (i) {
            System.out.println("Это живое дерево - " + n + ", ему " + a + " лет.");
        } else
            System.out.println("Это засохшее дерево - " + n + ", ему " + a + " лет.");
    }

    //Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал»
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        //Создание трех объектов класса и использование по одному конструктору на каждый
        Tree t1 = new Tree(46, "ель");
        Tree t2 = new Tree(58, true, "сосна");
        Tree t3 = new Tree();
    }
}

