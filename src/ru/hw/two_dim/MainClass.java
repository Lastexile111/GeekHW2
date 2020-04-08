package ru.hw.two_dim;

import java.util.Scanner;

public class MainClass {



    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        int result;
        try {
            result = get4x4Average(strToArr4x4(scan.nextLine()));
            System.out.println(result);
        }catch (Array4x4Exception | WrongFormatCellException e){
            System.out.println(e.getMessage());
        }



    }
    static String[][] strToArr4x4 (String str) throws Array4x4Exception {

        String[][] arr = new String[4][4];

        String[] layers = str.split("\\\\n");
        if (layers.length != 4){
            throw new Array4x4Exception("String doesn't fit in 4x4 array, rows != 4");
        }
        for( int i = 0; i < layers.length; i++){
            String[] positions = layers[i].split(" ");
            if (positions.length != 4){
                throw new Array4x4Exception("String doesn't fit in 4x4 array, columns != 4");
            }
            arr[i] = positions;
        }

        return arr;
    }

    static int get4x4Average(String[][] arr) throws WrongFormatCellException {
        int result = 0;
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++ ){
                try {
                    result += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new WrongFormatCellException("Somebody puts not int in cell");
                }
            }
        }
        return result/2;
    }
}
