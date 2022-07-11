package javaLabs.task9;

import java.util.*;

public class Exercise3 {
    //класс с одним полем
    static class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public User(String name) {
            this.name = name;
        }

        private Integer play() {
            return (int) (Math.random()*100+1);
        }

        @Override
        public String toString() {
            return this.name;
        }

        //чтобы элементы HashMap класса User сравнивались по хэшам имен, а не ссылок
        @Override
        public int hashCode() {
            return Objects.hash(this.name);
        }

        //чтобы объекты класса User сравнивались по имени, а не ссылкам
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }
    }

    public static void main(String[] args) {


        //создаем Map и заполняем генерируемыми данными
        Map<User, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User("User"+i);
            map.put(user, user.play());
        }
        System.out.println("Generated Hashmap:\n");
        map.entrySet().forEach(System.out::println);

        //считываем с консоли имя
        System.out.println("Введите ID пользователя :");
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        //ищем по HashSet объект с таким же именем
        System.out.println(map.get(new User("User"+id)));

    }
}
