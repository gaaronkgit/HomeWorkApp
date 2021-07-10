public class Plate
{
    int food;
    public Plate(int food)
    {
        this.food = food;
    }

    public void addFood(int qu)
    {
        System.out.println("Добавляю в тарелку " + qu + " еды!");
        food += qu;
    }

    public void eatFood(int foodEaten)
    {
        food -= foodEaten;
    }

    public boolean checkFood(int tryEatenFood)
    {
        if(tryEatenFood > food)
        {
            System.out.println("Невозможно съесть больше, чем лежит в тарелке");
            return false;
        }
        return true;
    }

    public void getInfo()
    {
        System.out.println("Еды в тарелке осталось: " + food);
    }
}
