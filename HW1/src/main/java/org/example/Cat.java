package org.example;

public class Cat extends Animal{

    public Cat(String name){
        this.name=name;
        setCounterCat();
    }
    public static void setCounterCat(){counterCat++;}
    @Override
    public void run(int len){
        if(len >=200) {
            System.out.format("%s пробежал %d м\n", this.name, len);
        }else{
            System.out.println("Кот не может пробежать больше 200 м!");
        }
    }
    @Override
    public void swim(int len){
        System.out.println("Кот не умеет плавать!");
    }
    @Override
    public void getCounter(){
        System.out.format("Создано котов: %s\n",counterCat);
    }
}
