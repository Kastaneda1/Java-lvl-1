package ru.gb.savin;

abstract class Animal {
    private int run_limit;
    private float jump_limit;
    private int swim_limit;
    private String name;

    Animal(int run_limit, float jump_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
        this.name = name;
    }
    protected String run(int distance) {
        if (distance <= run_limit) {
            return("Пробежала" + " " + distance);
        }return("");
    }
    protected String jump(float height)  {
        if ( height <= jump_limit ) {
            return("Прыгнула" + " "  + height);
        }return("");
    }
    protected String swim(int distance) {
        if (distance <= swim_limit) {
            return ("Проплыла" + " "  + distance);
        } return("Не умею плавать");
}

}
