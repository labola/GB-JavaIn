package org.example;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }
    public boolean decreaseFood(int n,int sat){
        if((food-n)>=0 && (sat-n)<=0) {
            food -= n;
            return true;
        }else {
            //System.out.println("Empty plate!");
            return false;
        }
    }
    public void info(){
        System.out.println("plate: "+ food);
    }
    public void addFood(int n){
        food+=n;
    }
}

