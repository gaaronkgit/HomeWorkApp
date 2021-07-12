public class Cat
{
    String name;
    int appetite;

    Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite()
    {
        return appetite;
    }

    void checkFood(Plate p)
    {
        if(p.food >= appetite)
        {
            eat(p);
        }
        else
        {
            System.out.println("Еды в тарелке слишком мало! Котик " + name + " не смог покушать");
        }
    }

    void eat(Plate p)
    {
        if(p.checkFood(appetite))
        {
            p.eatFood(appetite);
            System.out.println("Котик " + name + " покушал досыта! :-)");
        }
        else
        {
            System.out.println("Котик " + name + " остался голодным! :-(");
        }
    }
}
