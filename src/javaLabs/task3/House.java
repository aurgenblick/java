package javaLabs.task3;

import java.time.YearMonth;

//Создание класса Дом с полями
public class House {

    Integer floors;
    Integer yearBuilt;
    String name;

    //Метод для установки всех значений
    public void setHome (Integer floors, Integer yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    //Метод для вывода всех значений
    public String getInfo () {
        return new String("The house has "+floors+" floors, was built in "+yearBuilt+", and is named "+name);
    }

    //Метод, возвращающий количество лет с момента постройки
    public Integer getAge () {
        return (YearMonth.now().getYear() - yearBuilt);
    }

    public static void main(String[] args) {
        //Создание двух объектов класса Дом
        House h1 = new House();
        House h2 = new House();

        //Добавление характеристик объектам через соответствующий метод класса
        h1.setHome(4, 1734, "Кунсткамера");
        h2.setHome(3, 1742, "Здание двенадцати коллегий");

        System.out.println(h1.getInfo());
        System.out.println(h2.getInfo());
    }
}
