package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 400){
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num = num + 1;
        }
    }
}


