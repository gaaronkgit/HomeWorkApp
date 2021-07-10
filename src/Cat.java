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

    public void eat(Plate p)
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
