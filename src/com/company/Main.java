package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Random random = new Random();
    System.out.println("first random int is " + random.nextInt(10));
    System.out.println("first random double is " + random.nextDouble());

    int min = 5;
    int max = 10;
    int newRandom = random.nextInt((max-min) + 1) +min;
    System.out.println(newRandom);

    double randomDouble = Math.random();
    System.out.println(randomDouble);
    int rand = (int)(Math.random()*10);
    System.out.println(rand);
    }
}
