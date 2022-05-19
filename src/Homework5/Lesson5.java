package Homework5;

import Homework5.Employee;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Alex", "QA Engineer", 31, 3333333, "email1@mail.ru", 100000);
        persArray[1] = new Employee("Max", "Salesman", 22, 1111111, "email2@mail.ru", 80000);
        persArray[2] = new Employee("Mike", "Engineer", 41, 5555555, "email3@mail.ru", 90000);
        persArray[3] = new Employee("Bob", "Manager", 45, 6666666, "email4@mail.ru", 110000);
        persArray[4] = new Employee("Jane", "Developer", 33, 7777777, "email5@mail.ru", 190000);

        System.out.println("Сотрудники старше 40 лет:");
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].getInfo();

        Employee[] employees = {persArray[0],persArray[1],persArray[2],persArray[3],persArray[4]};
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getBonus() + " работника " + employees[i].getName() +
                    " с изначальной зп " + employees[i].getSalary());
        }
    }



}