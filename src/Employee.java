public class Employee
{
    String fio;
    String position;
    String phone;
    String email;
    double salary;
    int age;

    public Employee(String fio, String pos, String email, String phone, double sum, int age )
    {
        this.fio = fio;
        position = pos;
        this.phone = phone;
        this.email = email;
        salary = sum;
        this.age = age;
    }
    public void GetInfo()
    {
        System.out.println("===Информация о сотруднике===");
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Телефон: " + phone);
        System.out.println("Емаил: " + email);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }
}
