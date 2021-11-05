package ru.gb.savin;

class Cat extends Animal {
    Cat(int run_limit, float jump_limit, int swim_limit) {
        super(run_limit, jump_limit, swim_limit);
    }
    @Override
    protected String swim(int distance) {
        return("Плавать вообще не умеет");
    }
}

