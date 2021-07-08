public class Dog extends Animal
{

    Dog(String name)
    {
        super(name);
    }

    void run(int distance)
    {
        if(distance <= 500)
        {
            System.out.println(name + " Бежит " + distance + "м");
        }
        else
        {
            System.out.println(name + " не может бежать " + distance + "м");
        }
    }

    @Override
    void swim(int distance)
    {
        if(distance <= 10)
        {
            System.out.println("Собака плывет " + distance);
        }
        else
        {
            System.out.println("Так далеко собака плавать не может" + distance);
        }
    }
}
