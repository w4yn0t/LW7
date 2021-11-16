package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        int[] array = new int[10];
        for (int i=0; i<5; i++) array[i]=i;
        System.out.println("Solution #1: " + Arrays.toString(array));
        //2
        Scanner in1 = new Scanner(System.in);
        Random nRand = new Random();
        System.out.println("Solution #2:");
        System.out.print("Enter array size: ");
        int size = in1.nextInt();
        double[] doubleArray = new double[size];
        double sum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = nRand.nextInt(-50, 20);
            if (i == doubleArray.length - 1) System.out.print(doubleArray[i]);
            else System.out.print(doubleArray[i] + ", ");
            if (doubleArray[i] > 0) doubleArray[i] = 0;
            else if (doubleArray[i] < 0) sum += doubleArray[i];
        }
        System.out.printf("\nSum of negative numbers: %.2f\n", sum);
        //3
        Scanner in2 = new Scanner(System.in);
        System.out.println("Solution #3:");
        System.out.print("Enter array size: ");
        int coordsArraySize = in2.nextInt();
        int coordsCount = 2;
        int[][] coordsArray = new int[coordsArraySize][coordsCount];
        System.out.print("Array: ");
        for (int i = 0; i < coordsArraySize; i++) {
            for (int j = 0; j < coordsCount; j++) {
                coordsArray[i][j] = nRand.nextInt(-120, 120);
            }
            System.out.printf("[%d, %d] ", coordsArray[i][0], coordsArray[i][1]);
        }
        int i = 0, count = 0;
        while (i < coordsArraySize) {
            if (coordsArray[i][0] < 0 && coordsArray[i][1] > 0) count++;
            i++;
        }
        System.out.println("\nCount of coords in Q2: " + count);
    }
}
