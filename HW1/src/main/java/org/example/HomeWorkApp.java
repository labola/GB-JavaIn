package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        Dog dog1=new Dog("Bobik");
        dog1.getinfo();
        dog1.run(150);
        Dog dog2=new Dog("Zhorik");
        dog2.swim(10);
        Cat cat1 = new Cat("Goga");
        cat1.run(199);
        cat1.swim(10);
        dog1.getCounter();
        cat1.getCounter();
        Animal an = new Animal("Noname");
        an.getCounter();

    }
}
