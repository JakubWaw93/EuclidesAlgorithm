package com.kodilla.euclidesalgorithm;

public class EuclidesApp {
    public static void main(String[] args){

        EuclidesAlgorithm euclides = new EuclidesAlgorithm(5220550,481000);
        int commonDivisor = euclides.process1();
        System.out.println("Biggest common divisor by Euclides Algorithm: " + commonDivisor);
        int commonDivisor2 = euclides.process2();
        System.out.println("Biggest common divisor by 'modulo' method: " + commonDivisor2);
    }
}
