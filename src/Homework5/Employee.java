package Homework5;

public class Employee {

    private String name;
    private String profession;
    public int age;
    private int phone;
    private String email;
    private double salary;
    private String nameOfCompany;
    private static int count = 0;


    public String getName() {
        return name;
    }
    public String getProfession() {
        return profession;
    }
    int getAge() {
        return age;
    }
    public int getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getCount() {
        return count;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() { return salary * coef(); }

    public Employee(String name, String profession, int age, int phone, String email, double salary) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        nameOfCompany = "Рога и копыта";
        count++;
    }

    private double coef() {
        return 100/50 * 3 /4;
    }

    public void getInfo() {
        System.out.println("name: "+name + "\n"+
                "profession: "+profession + "\n"+
                "email: " +email + "\n"+
                "phone: "+phone + "\n"+
                "age: "+age + "\n"+
                "salary: "+salary);
        System.out.println();

    }
}

