package org.example;

public class MyArraySizeException extends CustomException{
    MyArraySizeException() {
        super("Размерность массива должна быть [4 x 4]\n");
    }
}
