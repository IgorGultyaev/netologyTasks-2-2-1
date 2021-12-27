package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int [][] rotation(int[][] arr, int angle){
        int size = arr.length;
        int [][]colors = new int [size] [size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (angle == 90) {
                    colors[i][j] = arr[size-1-j][i];
                }
                else if (angle == 180){
                    colors[i][j] = arr[size-1-i][size-1-j];
                }
                else if (angle == 270){
                    colors[i][j] = arr[j][size-1-i];
                }
                else colors = arr;
            }
        }

        return colors;
    }
    public static void matrixPrint(int [][] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
	int SIZE = 10;
    int [][]colors = new int [SIZE] [SIZE];

        Random random = new Random();

        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                colors[i][j] = random.nextInt(256);
            }
        }

        matrixPrint(colors);
        Scanner scanner = new Scanner(System.in);
        String inputAngle = scanner.nextLine();

        int angle = Integer.parseInt(inputAngle);

        colors = rotation(colors,angle);
        matrixPrint(colors);




    }
}
