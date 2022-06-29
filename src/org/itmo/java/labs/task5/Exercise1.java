package org.itmo.java.labs.task5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise1 {

    // Метод для ввода текста
    private static String getText() {
        Scanner sc = new Scanner(System.in);
        String newText = sc.nextLine();
        return newText;
    }

    /*Задание 1. Метод для поиска самого длинного слова в тексте
     */

    private static void longestWord(String inputText) {
        //Посимвольно очищаем полученный текст от знаков пунктуации и чисел (оставляем только буквы и пробелы)
        StringBuilder cleanInputText = new StringBuilder(inputText.length());
        for (int i = 0; i < inputText.length(); i++) {
            char symb = inputText.charAt(i);
            if (Character.isAlphabetic(symb) || Character.isSpaceChar(symb)) {
                cleanInputText.append(symb);
            }
        }
        //Создаем массив из слов
        String[] inputWords = (cleanInputText.toString()).split(" ");
        //Обрезаем пробелы в словах массива
        for (String inputWord : inputWords) {
            inputWord = inputWord.trim();
        }
        //Перебираем слова в массиве слов в поиске самого длиного и записываем его индекс в массиве
        int lengthCounter = 0;
        int wordIndex = 0;
        for (int i = 0; i < inputWords.length; i++) {
            if (inputWords[i].length() > lengthCounter) {
                lengthCounter = inputWords[i].length();
                wordIndex = i;
            }
        }
        //Выводим результат
        System.out.println("Самое длинное слово \"" + inputWords[wordIndex] + "\" имеет длину " + lengthCounter);
        ;
    }


    /*Задание 2. Метод для определения, является ли слово палиндромом
     */

    private static void isPalindrome(String inputWord) {
        boolean Palindrome = false;
        for (int i = 0; i < (inputWord.length() / 2); i++) {
            char first = inputWord.charAt(i);
            char last = inputWord.charAt(inputWord.length() - 1 - i);
            if (first == last) {
                Palindrome = true;
            }
        }
        if (Palindrome) {
            System.out.println("Слово \"" + inputWord + "\" является палиндромом");
        } else {
            System.out.println("Слово \"" + inputWord + "\" не является палиндромом");
        }
    }


    /*Задание 3. Метод заменяющий все вхождения слова "бяка" на "[вырезано цензурой]"
     */
    private static void censorship(String uncensoredText, String unwantedWord) {
        String replaceWord = "[вырезано цензурой]";
        String[] textWords = uncensoredText.split(" ");
        StringBuilder censoredText = new StringBuilder();
        for (String textWord : textWords) {
            //Случай, когда всё слово равно бяке - вместо всего слова вставляем заглушку
            if (textWord.equalsIgnoreCase(unwantedWord)) {
                censoredText.append(replaceWord);
            }
            //Случай, когда слово содержит бяку
            else if (textWord.toLowerCase().contains(unwantedWord.toLowerCase())) {
                //Определяем индекс, с которого входит бяка
                int indexOfReplacement = textWord.toLowerCase().indexOf(unwantedWord.toLowerCase());
                //Выделяем ту часть слова, которая относится к бяке
                String textWordPart = textWord.substring(indexOfReplacement, indexOfReplacement + unwantedWord.length());
                //Составляем слово, где часть, относящаяся к бяке, заменяется заглушкой
                var censoredWord = textWord.replaceAll(textWordPart, replaceWord);
                //Проверям, что составленное слово не содержит бяку и удаляем её, если содержит
                while (censoredWord.toLowerCase().contains(unwantedWord.toLowerCase())) {
                    //Определяем индекс, с которого входит бяка
                    int newindexOfReplacement = censoredWord.toLowerCase().indexOf(unwantedWord.toLowerCase());
                    //Выделяем ту часть слова, которая относится к бяке
                    String censoredWordPart = censoredWord.substring(newindexOfReplacement, newindexOfReplacement + unwantedWord.length());
                    //Составляем слово, где часть, относящаяся к бяке, заменяется заглушкой
                    String oldCensoredWord = censoredWord;
                    censoredWord = oldCensoredWord.replaceAll(censoredWordPart, replaceWord);
                }

                //Вместо исходного слова вставляем составленное слово
                censoredText.append(censoredWord);
            }
            //Случай, когда слово не содержит бяку
            else {
                censoredText.append(textWord);
            }
            //Добавляем пробел после слова
            censoredText.append(" ");
        }
        //Выводим отцензурированный текст
        System.out.println("\nЗадание 3. Отцензурированный текст: \n"+censoredText.toString());
    }

    /*Задание 4. Поиска количества вхождений подстроки в строку
     */

    private static void occurenceCount(String givenText) {
        String string = givenText.substring(2, 4);
        StringBuilder remainingText = new StringBuilder(givenText);
        int occurenceCounter = 0;
        //Выполняем цикл со счетчиком, если строка содержит подстроку
        while (remainingText.toString().contains(string)) {
            //Прибавляем счетчик и задаем индекс, после которого надо производить дальнейшую проверку
            occurenceCounter++;
            int newindexOfOccurence = remainingText.indexOf(string) + string.length();
            //Выделяем оставшаяся часть строки, которая следует после первого вхождения подстроки
            String remainingTextPart = remainingText.substring(newindexOfOccurence + string.length(), remainingText.length());
            //Присваиваем строке зачение оставшейся части строки
            remainingText = new StringBuilder(remainingTextPart);
        }
        //Выводим счетчик вхождений
        System.out.println("Строка \"" + string + "\" повторяется в тексте " + occurenceCounter + " раз.");
    }

    /*Задание 5. Инвертирование слов в строке, не содержащей знаков препинания, если слова разделены пробелами
     */

    private static void wordsInverter(String givenText) {
        //Разделяем текст на слова по пробелам и создаем массив из этих слов
        String[] givenWords = givenText.split(" ");
        //Создаем массив инвертированных слов той же длины
        String[] invertedWords = new String[givenWords.length];
        //Задаем начало отсчета элементов массива для последующего заполнения массива инвертированных слов в цикле
        int i = 0;
        //Заполняем массив инвертированных слов, инвертируя по одному слова массива исходных слов с помощью метода StringBuilder
        for (String givenWord : givenWords) {
            StringBuilder wordBuilder = new StringBuilder(givenWord);
            invertedWords[i] = wordBuilder.reverse().toString();
            i++;
        }
        //Соединяем элементы массива инвертированных слов в одну строку и выводим
        System.out.println(String.join(" ", invertedWords));
    }


    public static void main(String[] args) {

        //Задание 1. Самое длинное слово в тексте
        System.out.println("Задание 1. Подалуйста введите текст: ");
        String text = getText();
        longestWord(text);
        //String text2 = "В 2020 году можно было бы написать самый длинный текст на свете, если бы проводить время продуктивно . Ведь более 9000000000 людей оказались дома без большого выбора разлечений ...............";
        //longestWord(text2);

        //Задание 2. Определение палиндрома
        System.out.println("\nЗадание 2. Пожалуйста введите слово: ");
        String word = getText();
        isPalindrome(word);

        //Задание 3. Замена слова в тексте заглушкой
        String badText = "Мне бяка по-настоящему нравится больше чего-либо в разработке ПО делать фреймворки, Бяка позволяющие другим разработчикам создавать что-то крутое. БЯКА Иногда, в погоне за ибЯкадеальбякАным кодом, ко мне на ум приходят странные идеи, но бякАпри реализации который C# может дойти до предела своих возможностей.\n" +
                "Не так давно произошёл подобный случай, когда БЯКА и мы вместе с коллегой искали способ избежать передачи большого количества типовых параметров в тех местах, где компилятор должен был по идее их вывести. Однако бяКа , C# так устроен, что способен выводить типы в обобщённых вызовах только из передаваемых параметров метода.";
        String badWord = "бяка";
        censorship(badText, badWord);


        //Задание 4. Посчет количества вхождений подстроки в строку
        String bigString = "Оаоаооаоооаоо оаоаоаооао оаааоуууэаоаа оаоаоээыыыао";
        System.out.println("\nЗадание 4. Дана строка : \n"+bigString);
        occurenceCount(bigString);

        //Задание 5. Инвертирование слов в строке
        System.out.println("\nЗадание 5. Подалуйста введите текст без знаков препинания ");
        String stringOfWords = getText();
        System.out.println("Инвертируем слова в строке :");
        wordsInverter(stringOfWords);
    }

}
