package org.example;

public class HW3 {
    public static void main(String[] args) {
        //ex. 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        change(arr1);
        //ex. 2
        int[] arr2 = new int[100];
        for(int i=0; i < arr2.length; i++)
        {
            arr2[i]=i+1;
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //ex. 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationSix(arr3);
        System.out.println();
        //ex. 4
        int[][] arr4= new int[9][9];
        diagonals(arr4);
        System.out.println();
        //ex. 5
        int len=10, initialValue = 3;
        int[] arr5 = NewArr(len,initialValue);
        for (int i=0; i<len; i++)
        {
            System.out.print(arr5[i]+" ");
        }
        System.out.println();
        //ex. 6
        int[] arr6 = {30,20,10,5,4};
        MinMax(arr6);
        //ex. 7
        int[] arr7 = {1, 1, 1, 2, 1};
        System.out.print("Равны ли части массива? ");
        if(EqualParts(arr7))
        {
            System.out.print("True");
        }else
        {
            System.out.print("False");
        }
        System.out.println();
        //ex. 8
        int[] arr8 = {1,2,3,4};
        int n=-2;
        Switch(arr8,n);

    }

    public static void change(int[] arr) {
        for (int i=0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                arr[i]=0;
            }else
            {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println("");

    }

    public static void multiplicationSix(int[] arr) {
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] < 6)
            {
                arr[i]*=6;
            }
            System.out.print(arr[i]+" ");
        }

    }
    public static void diagonals(int[][] arr){
        for(int i=0, c= arr.length; i< arr.length; i++,c--)
        {
            for(int j= 0; j < arr.length; j++)
            {
                 if(i==j)
                 {
                     arr[i][j] = 1;
                     arr[i][c-1]=1;

                 }
            }
        }
        for(int i=0; i< arr.length; i++)
        {
            for(int j= 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] NewArr(int len, int initialValue) {
        int[] arrtemp = new int[len];
        for(int i=0; i<len; i++)
        {
                arrtemp[i]=initialValue;
        }

        return arrtemp;
    }
    public static void MinMax(int[] arr){
        int min=0,max=0, temp=0;
        int[] arrtemp = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            arrtemp[i] = arr[i];
        }
        for(int i=0; i< arr.length; i++)
        {
            for (int j=0; j<arr.length;j++)
            {
                if(arr[i]<arrtemp[j] && max<arr[j])
                {
                    max=arrtemp[j];
                }
                if(arr[i]>arrtemp[j])
                {
                    min = arrtemp[j];
                }
            }
        }

        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }

    public static boolean EqualParts(int[] arr){
        int suma=arr[0], len=arr.length, sumat=0;
        for (int i=1; i<len-1; i++)
        {
            suma=suma+arr[i];
            sumat=0;
            for(int j=len-1; j>i; j--)
            {
                sumat=sumat+arr[j];
            }
            if(suma == sumat)
            {
                return true;
            }
        }
        return false;
    }

    public static void Switch(int[] arr, int n){
        if(n>0)
        {
             for (int i = 0; i < n; i++)
             {
                    int temp = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--)
                    {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = temp;
            }
        }else
        {
            for (int i = 0; i < n * (-1); i++)
            {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"");
        }
    }
}
