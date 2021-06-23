public class Lesson2
{
    public static void main(String[] args)
    {
        //Вызов методов
        System.out.println("Результат работы метода checkSum: " + checkSum(5,3));
        System.out.println("Результат работы метода checkNum: " + checkNum(5));
        System.out.println("Результат работы метода checkNumSign: " + checkNumSign(-5));
        printString(5, "Привет, о дивный мир Java");
        System.out.println("Год високосный: " + checkYear(2020));
    }

    public static boolean checkSum(int a, int b)
    {
        boolean result = false;
        int sum = a + b;
        if(sum > 10 && sum <= 20)
        {
            result = true;
        }
        return result;
    }

    public static boolean checkNum(int a)
    {
        return a >= 0;
    }

    public static boolean checkNumSign(int a)
    {
        return a <= 0;
    }

    public static void printString(int a, String s)
    {
        for (int i = 0; i <= a; i++)
        {
            System.out.println(s);
        }
    }

    public static boolean checkYear(int year)
    {
        boolean result = false;
        if(year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))) result = true;
        return result;
    }
}
