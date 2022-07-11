package javaLabs.task9;


import java.util.*;


public class lesson9 {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1234);
        integers.add(12345);
        integers.add(123456);
        integers.add(1234567);
        integers.add(12345678);

        List<Integer> integers2 = Arrays.asList(123, 1234, 12345, 123456);
        // так список будет неизменяемым immutable

//        for (Integer integer : integers) {  <-- удаление по циклу невозможно
//            if (integer%2 == 0) {
//                integers.remove(integer);
//            }
//        }
        //удаление по циклу невозможно


//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() > 1234) {
//                iterator.remove();
//            }
//        }
        //такое удаление сработает правильно


        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));

        }

        Integer integer = integers.get(5);
        //IndexOutOfBoundException


        integers.subList(0, 2);
        //выводит подсписок по индексам

        System.out.println(integers);

        //* HASHSETS *//
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }
        //будет всего один элемент, потому что каждый раз элементы повторяются

        set.add("String");
        set.add("777");
        set.add("world");
        set.add("Hello");
        System.out.println(set);

        //TreeSet создает отсортированный


        Set<Integer> integers3 = new HashSet<>(integers);
        System.out.println(integers3);
        //создастся HashSet из тех же элементов, но без дублей

        //*MAP
        // набор пар ключ-значение
        // ключи не могут повторяться
        //  key     value
        Map<String, Integer> map = new HashMap<>();

        map.put("John",1);
        map.put("Alice",2);
        map.put("Katie",3);
        map.put("Bob",4);
        map.put("Mike",5);
        map.put("Mike",6); // здесь используется тот же ключ, что вызовет перезапись значения с этим ключом

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        ///методы, возващающие ключи и значения
    }


    public static void method(List<String> strings) {

    }

    public static String getKeyByValue(Map<String, Integer> map, Integer value) {
        String result = null;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer mapValue = pair.getValue();
            if (value.equals(mapValue)) {
                result = key;
            }
        }
        return result;
    }
}