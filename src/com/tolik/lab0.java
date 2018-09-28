package com.tolik;

public class lab0 {
    // Begin 2 task
    // return the area of reckt
    public float rectArea(float side){
        if( side < 0)
            throw new IllegalArgumentException();
        return side*side;
    }
    // Integer 2 task
    // finde full tons in kilograms
    public int fullTons(int mass)
    {
        if (mass < 0)
            throw new IllegalArgumentException();
        return mass/1000;
    }
    // Boolean 2 task
    // value is int
    // if value is equals or not
    public boolean isEquals(int value){
        return value % 2 == 0;
    }
    // If 2 task
    //  we have int value
    //  if value more then zero then increase by one
    //  else decrease by two
    public int changeValue(int value) {
        return value >= 0 ? value + 1 : value - 2;
    }
    // Case 2 task
    // 1 — «плохо»,
    // 2 — «неудовлетворительно»,
    // 3 — «удовлетворительно»,
    // 4 — «хорошо»,
    // 5 — «отлично»
    // if value out of rang then return error
    public String examinate(int value){
        switch(value){
            case 1 : return "плохо";
            case 2 : return "неудовлетворительно";
            case 3 : return "удовлетворительно";
            case 4 : return "хорошо»";
            case 5 : return "отлично";
            default: return "ошибка";
        }
    }
    // For 2 task
    // we have X = real and N > 0
    // find the result of expresion :
    // 1 + X + X/2! + ... + X/N!
    public double exp(double X, int N){
        // sum is 1 becouce we did zero step by hands
        double sum = 1;
        long f = 1; // f is f!
        for(int i = 1; i <= N; ++i){
            f *= i;
            sum += X/f;
        }
        return sum;
    }
    // While 2
    // find how many lines B in A line
    // if A > B
    public int linesIn(float line_a, float line_b){
        int count = 0;
        double temp = 0;
        while(temp < line_a){
            temp += line_b;
            ++count;
        }
        return count;
    }
    // Array 2
    // int array
    // return line numb of last value of array for which is true expresion array[1] < array[k] < array [10]
    // else return 0
    public int arrayTask(int[] array){
        for(int i = array.length - 2; i >= 1; --i)
            // the value i is not 0 and array.langth becouce in thet way the expresion will never be true
            if( array[0] < array[i] && array[i] < array[ array.length-1 ])
                return i+1;

        return 0;
    }
    // Matrix 2
    // change raws of matrix
    // k1 to k2
    public void changeRaws(float[][] mtrx,int k1, int k2){
        for(int i = 0; i < mtrx.length; ++i){
            float temp = mtrx[i][k1];
            mtrx[i][k1] = mtrx[i][k2];
            mtrx[i][k2] = temp;
        }
    }
}
