package ru.gb.savin;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal catbarsik = new Cat (350, 2, 0);
        Animal dogdrug = new Dog (780, 1.5f, 15);
        System.out.println("Кошка" + "\n" + catbarsik.run(10) + "\n" + catbarsik.jump(1) + "\n" + catbarsik.swim(1) + "\n");
        System.out.println("Собака" + "\n" + dogdrug.run(10) + "\n" + dogdrug.jump(1) + "\n" + dogdrug.swim(1));
    }
}
