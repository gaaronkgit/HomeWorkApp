public class Lesson5
{
    public static void main(String []args)
    {
        Employee []employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Иван Иванов", "Программист", "II@gmail.com","+79876543215",100000,35);
        employeeArr[1] = new Employee("Петр Иванов", "СисАдмин", "PI@gmail.com","+79876258215",700000,45);
        employeeArr[2] = new Employee("Петр Петров", "Босс", "BB@gmail.com","+79876251595",150000,43);
        employeeArr[3] = new Employee("Максим Петров", "Бухгалтер", "MP@gmail.com","+79814751595",50000,22);
        employeeArr[4] = new Employee("Максим Петров", "Бухгалтер", "MP@gmail.com","+79814751595",50000,30);

        for(int i = 0; i < employeeArr.length; i++)
        {
            if(employeeArr[i].age >= 40)
            {
                employeeArr[i].GetInfo();
            }
        }
    }
}
