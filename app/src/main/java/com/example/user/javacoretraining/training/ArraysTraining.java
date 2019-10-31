package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < valuesArray.length; i++) {
                if (valuesArray[i - 1] > valuesArray[i]) {
                    int tmp = valuesArray[i - 1];
                    valuesArray[i - 1] = valuesArray[i];
                    valuesArray[i] = tmp;
                    sorted = false;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if (values.length == 0) return 0;
        else{
            int max = values[0];

            for(int i = 0; i < values.length; i++){
                if (values[i] > max) max = values[i];
            }

            return max;
        }
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++)
        {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if (numbersCount < 1) return new int[]{};

        int[] fib = new int[numbersCount];
        fib[0] = 1;
        fib[1] = 2;

        for(int i = 1; i < fib.length - 1; i++){
            fib[i+1] = fib[i-1] + fib[i];
        }

        return fib;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count > maxCount) maxCount = count;
            count = 0;
        }

        return maxCount;
    }
}
