public class Lesson7
{
    public static void main(String []args)
    {
        Plate plate = new Plate(0);
        plate.addFood(100);
        plate.getInfo();

        Cat cat = new Cat("Барсик", 50);
        cat.eat(plate);
        plate.getInfo();

        Cat []cats = new Cat[3];
        cats[0] = new Cat("Коржик", 30);
        cats[1] = new Cat("Карамелька", 20);
        cats[2] = new Cat("Компот", 80);

        for (int i = 0; i < cats.length; i++)
        {
            cats[i].checkFood(plate);
            plate.getInfo();
        }
    }
}
