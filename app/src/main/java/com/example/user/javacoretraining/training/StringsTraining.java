package com.example.user.javacoretraining.training;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < text.length(); i += 2){
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int[] getArrayLastSymbol(String text) {
        ArrayList<Integer> numbers = new ArrayList<>();
        if (text.isEmpty()) {
            return new int[0];
        }
        else {
            char c = text.charAt(text.length() -1);
            for (int i = 0; i < text.length() - 1; i++)
                if (c == text.charAt(i)) numbers.add(i);
        }
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {

        int count = 0;
        for (int i = 0; i <= text.length() - 1; i++){
            if (Character.isDigit(text.charAt(i))){
                count++;
            }
        }

        return count;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цыфры заменены словами
     */
    public String replaceAllNumbers(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
                switch (text.charAt(i)){
                    case('0'): sb.append("zero");break;
                    case('1'): sb.append("one");break;
                    case('2'): sb.append("two");break;
                    case('3'): sb.append("three");break;
                    case('4'): sb.append("four");break;
                    case('5'): sb.append("five");break;
                    case('6'): sb.append("six");break;
                    case('7'): sb.append("seven");break;
                    case('8'): sb.append("eight");break;
                    case('9'): sb.append("nine");break;
                }
            }
            else sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            if (Character.isUpperCase(text.charAt(i))) sb.append(Character.toLowerCase(text.charAt(i)));
            else if (Character.isLowerCase(text.charAt(i))) sb.append(Character.toUpperCase(text.charAt(i)));
            else sb.append(text.charAt(i));
        }
        return sb.toString();
    }

}
