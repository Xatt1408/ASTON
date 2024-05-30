public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }


    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];


        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employee("Sidorov Sidr", "Technician", "sidorov@mailbox.com", "892312314", 35000, 28);
        persArray[3] = new Employee("Kuznetsov Kuzma", "Developer", "kuznetsov@mailbox.com", "892312315", 45000, 32);
        persArray[4] = new Employee("Smirnov Smir", "Analyst", "smirnov@mailbox.com", "892312316", 50000, 29);


        for (Employee emp : persArray) {
            emp.printInfo();
            System.out.println();
        }
    }
}