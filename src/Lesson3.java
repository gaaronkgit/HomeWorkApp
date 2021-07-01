import java.util.Arrays;

public class Lesson3 {
    public static void main(String []args)
    {
        task1();
        task2();
        task3();
        task4(5);
        printArr(task5(5,2),"Заполненный массив");
    }

    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void task1()
    {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArr(arr, "до изменений");
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        printArr(arr, "после изменений");
    }

    /*Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void task2()
    {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i+1;
        }
        printArr(arr, "");
    }

    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    public static void task3()
    {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr(arr, "до изменений");
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
            {
                arr[i] *= 6;
            }
        }
        printArr(arr, "после изменений");
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void task4(int size)
    {
        int[][] arr = new int[size][size];
        for(int i=0; i<size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                arr[i][j] = (i == j) || (i + j == size - 1) ? 1 : 0;
            }
        }
        printMatrix(arr);
    }

    /*Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] task5(int len, int initialValue)
    {
        int []arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void printMatrix(int[][] arr)
    {
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArr(int [] arr, String state)
    {
        StringBuilder s = new StringBuilder();
        System.out.println("Массив arr " + state);
        for(int i = 0; i < arr.length; i++)
        {
            if(i < arr.length - 1)
            {
                s.append(arr[i]).append(",");
            }
            else
            {
                s.append(arr[i]);
            }
        }
        System.out.println(s);
    }

}
