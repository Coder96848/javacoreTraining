package com.example.user.javacoretraining.training;

 /**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        return (firstValue + secondValue) / 2;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {

        int newFirstValue = firstValue * 2;
        int newSecondValue = secondValue - 3;
        int newThirdValue = (int) Math.pow(thirdValue, 2);

        return newFirstValue + newSecondValue + newThirdValue;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        if (value > 3)
            return value + 10;
        else
            return value - 10;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    public int swapNumbers(int value) {
        if (value < 10) return value;

        String newValue = Integer.toString(value);
        char[] c = newValue.toCharArray();

        String result;
        if (c.length > 5){
            result = new String(c);
            return Integer.parseInt(result);
        }
        else{
            char temp = c[0];
            c[0] = c[c.length - 1];
            c[c.length - 1] = temp;
            result = new String(c);
            return Integer.parseInt(result);
        }
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */
    public int zeroEvenNumber(int value) {
        if (value < 10) return value;

        String stringValue = Integer.toString(value);
        char[] c = stringValue.toCharArray();

        for (int i = 0; i < c.length - 1; i++){
            if (Integer.parseInt(String.valueOf(c[i])) % 2 == 0){
                c[i] = '0';
            }
        }
        String result = new String(c);
        return Integer.parseInt(result);
    }
}
