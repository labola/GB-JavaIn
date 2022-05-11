package org.example;

public class Cat{
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p){

        if (!p.decreaseFood(appetite, satiety)){
            satiety=0;
            //System.out.format("\nCat %s not satifiety!\n",name);
        }else{
            satiety=0;
            satiety+=appetite;
            //System.out.format("\nCat %s satifiety!\n",name);
        }
    }

    public void getSatiety() {
        System.out.format("Satiety %s: %s\n", name,satiety);
    }
}
