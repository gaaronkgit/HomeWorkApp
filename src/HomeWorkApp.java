public class HomeWorkApp {
    public static void main (String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
    }
    static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign()
    {
        int a = 3;
        int b = 5;
        int c = a + b;
        if(c > 0)
        {
            System.out.println("Сумма чисел a и b положительная");
        }
        else if (c == 0)
        {
            System.out.println("Сумма чисел a и b равна 0");
        }
        else
        {
            System.out.println("Сумма чисел a и b отрицательная");
        }
    }

    static void printColor()
    {
        int value = 15;
        if(value <= 0)
        {
            System.out.println("Красный");
        }
        else if(value > 0 && value <= 100)
        {
            System.out.println("Желтый");
        }
        else
        {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers()
    {
        int a = 3;
        int b = 5;
        int c = a + b;
        if(a >= b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }
    }
}