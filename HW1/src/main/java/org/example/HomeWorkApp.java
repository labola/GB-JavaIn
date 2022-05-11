package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] arrcat = {new Cat("Barsik", 4, 4),
                new Cat("Murzik", 6, 6),
                new Cat("Persik", 1, 10),
                new Cat("Garik", 45, 45),
                new Cat("Murka", 30, 30)
        };
        Plate plate= new Plate(50);
        for(int i=0; i < arrcat.length; i++){
            arrcat[i].eat(plate);
            arrcat[i].getSatiety();
        }
        plate.addFood(1);
        plate.info();

    }
}
