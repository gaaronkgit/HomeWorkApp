public class Cat extends  Animal
{
    Cat(String name)
    {
        super(name);
    }

    void run(int distance)
    {
        if(distance <= 200)
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
        System.out.println("Коты не умеют плавать!!!");
    }
}
