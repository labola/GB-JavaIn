package org.example;

public class Animal {
    String name;
    //int len;
    public static int counterAnimal;
    public static int counterCat;
    public static int counterDog;


    public Animal(){}
    public Animal(String name){
        this.name=name;
        setCounterAnimal();
    }

    public void setCounterAnimal(){counterAnimal++;}
    public void run(int len){
        System.out.format("%s пробежал %d м\n", this.name, len);
    }
    public void swim(int len){
        System.out.format("%s проплыл %d м\n", this.name, len);
    }
    public void getinfo(){
        System.out.println(name);
    }
    public void getCounter(){
        System.out.format("Создано животных: %s",counterAnimal);
    }

}
