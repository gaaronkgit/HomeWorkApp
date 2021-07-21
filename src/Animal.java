public abstract class Animal
{
    String name;
    int appetite = 0;

    Animal(String name)
    {
        this.name = name;
    }

    abstract void swim(int distance);
}
