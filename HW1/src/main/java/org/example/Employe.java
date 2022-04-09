package org.example;

public class Employe {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employe() {
        this.name = "Иванов Иван Иванович";
        this.position = "CEO";
        this.email = "ii@mail.ru";
        this.number = "8900000000";
        this.salary = 100000000;
        this.age = 100;
    }

    public Employe(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.format("\nInfo about Employe:\nName: %s, Position: %s, Email: %s, Number: %s, Salary: %d, Age: %d",
                name, position, email, number, salary, age);
    }
    public int getAge(){
        return age;
    }

}
