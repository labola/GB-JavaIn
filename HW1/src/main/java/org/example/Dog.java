package org.example;

public class Dog extends Animal{


    public Dog(String name){
        this.name=name;
        setCounterDog();

    }
    public static void setCounterDog(){counterDog++;}
    @Override
    public void run(int len){
        if(len >=500) {
            System.out.format("%s пробежал %d м\n", this.name, len);
        }else
        {
            System.out.println("Собака не может пробежать больше 500 м!");
        }
    }
    @Override
    public void swim(int len){
        if(len >=500) {
            System.out.format("%s проплыл %d м\n", this.name, len);
        }else
        {
            System.out.println("Собака не может проплыть больше 10 м!");
        }
    }
    @Override
    public void getCounter(){
        System.out.format("Создано собак: %s\n",counterDog);
    }
}
