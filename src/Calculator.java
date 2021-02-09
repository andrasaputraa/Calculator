/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chandra Saputra
 */
public class Calculator {
    public static int add(int number1, int number2){
        return number1 + number2;
    }
    public static int sub(int number1, int number2){
        return number1 - number2;
    }
    public static int mul(int number1, int number2){
        return number1 * number2;
    }
    public static int divInt(int number1, int number2){
        if (number2==0){
            throw new IllegalArgumentException("Can't Devide By Zero..!!");
        }
        //return number1/number2;
        return 0;
    }
    public static double divReal(int number1, int number2){
        if (number2==0){
            throw new IllegalArgumentException("Can't Devide By Zero..!!");
        }
        return 0;
    }
}
