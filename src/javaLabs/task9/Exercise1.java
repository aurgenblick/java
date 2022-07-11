package javaLabs.task9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise1 {

    public static HashSet<Users> deleteDuplicates (List<Users> inputList) {
        HashSet<Users> usrSet = new HashSet<Users>();
        usrSet.addAll(inputList);
        return usrSet;
    }

    public static void main(String[] args) {
        //создаем коллекцию объектов
        List<Users> usrList = new ArrayList<Users>();
        usrList.add(new Users("Will", "online", 3));
        usrList.add(new Users("Will", "online", 3)); //поля у объекта такие же, но ссылки разные
        usrList.add(new Users("John", "online", 2));
        usrList.add(usrList.get(0)); //добавляется ссылка на тот же объект
        usrList.add(new Users("Andy", "online", 5));

        //выводим коллекцию до удаления дубликатов
        System.out.println(usrList);

        //выводим коллекцию после применения метода для удаления дубликатов
        System.out.println(deleteDuplicates(usrList));
    }

    static class Users {

        String name;
        String status;
        int hoursOnline;

        public Users(String name, String status, int hoursOnline) {
            this.name = name;
            this.status = status;
            this.hoursOnline = hoursOnline;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getHoursOnline() {
            return hoursOnline;
        }

        public void setHoursOnline(int hoursOnline) {
            this.hoursOnline = hoursOnline;
        }

        @Override
        public String toString() {
            return this.name + " " + this.status + " " + this.hoursOnline;
        }
    }
}

