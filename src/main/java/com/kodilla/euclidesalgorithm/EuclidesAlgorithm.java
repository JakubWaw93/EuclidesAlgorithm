package com.kodilla.euclidesalgorithm;

public class EuclidesAlgorithm {
    private int a;
    private int b;

    public EuclidesAlgorithm(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int process1(){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else if(a<b){
                b=b-a;
            }
        }
        return a;
    }
    public int process2(){
        while(a%b!=0){
            a=b;
            b=a%b;
        }
        return b;
    }
}
