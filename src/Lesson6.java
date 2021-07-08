public class Lesson6
{
    public static void main(String [] args)
    {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик");

        dog.run(150);
        cat.run(50);

        dog.swim(50);
        cat.swim(15);
    }
}
