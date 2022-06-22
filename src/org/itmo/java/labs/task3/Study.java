package org.itmo.java.labs.task3;

class Study {

    private String course;

    //В классе Study дописан конструктор, который принимает один параметр (String с) м устанавливает это значение для поля "course".
    Study(String c) {
        course = c;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        //Создание объекта класса Study с заданным значением поля
        Study Study1 = new Study("Изучение Java - это просто!");
        //Обращение к методу printCourse для вывода значения поля course
        System.out.println(Study1.printCourse());
    }
}