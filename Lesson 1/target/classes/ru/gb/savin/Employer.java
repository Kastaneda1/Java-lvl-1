package ru.gb.savin;

public class Employer {
    public static void main(String[] args) {
        Employee[] employers = new Employee[5];
        employers[0] = new Employee("Линус Торвальдс", "Системный администратор", "tor@web.ru", "+79993663244", 100000, 49);
        employers[1] = new Employee("Ковалев Артур Арсланович", "Топ менеджер", "koval@primer.ru", "+79956345544", 200000, 25);
        employers[2] = new Employee("Жюль Верн Есмаилович", "Экспедитор", "30oz@mail.ru", "+79936235544", 450000, 65);
        employers[3] = new Employee("Данте Елегьери", "Старший редактор", "devil@god.kz", "+79952634544", 350000, 32);
        employers[4] = new Employee("Едгар Алан По", "Руководитель депортамента", "po@yandex.ru", "+7992534144", 550000, 41);
        for (int i = 0; i < employers.length; i++)
            if (employers[i].getYearsOld() > 40) employers[i].print();
            }
}