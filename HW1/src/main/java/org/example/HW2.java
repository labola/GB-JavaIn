package org.example;

public class HW2 {
    public static void main(String[] args) {

        System.out.println(sumNum(10,10));

        checkNum(-1);

        if(checkNumB(0)){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }

        stringLoop("ABC", 5);

        if (Year(1800))       {System.out.println("Високосный год");}
        else                     {System.out.println("Не високосный год");}
    }

    public static boolean sumNum(int a, int b){
        if(a+b > 10 && a+b <= 20){return true;}

        return false;
    }

    public static void checkNum (int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean checkNumB (int a){
        if(a >= 0){
            return  true;
        }else {
            return false;
        }
    }

    public static void stringLoop (String str, int count)
    {
        for (int i=0; i < count; i++){
            System.out.println(str);
        }
    }

    public static boolean Year (int y){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        {return true;}
        else
        {return false;}
    }
}
