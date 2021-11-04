package ru.gb.savin;

public class Employee {
    private String FIO;
    private String Position;
    private String email;
    private String number;
    private int salary;
    private int yearsOld;

    public Employee(String FIO, String Position,String email,String number,int salary,int yearsOld ) {
        this.FIO = FIO;
        this.Position = Position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void print() {
         System.out.printf("ФИО - %s, Должность - %s, эл.адрес - %s, Т.номер - %s, Зар.плата - %d, Возраст - %d\n",FIO, Position,email,number,salary,yearsOld);
    }


}