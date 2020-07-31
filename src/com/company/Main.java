package com.company;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double[] digits = new double[16];
        digits[0] = 4.5;
        digits[1] = 6.8;
        digits[2] = 8.5;
        digits[3] = 10.6;
        digits[4] = 25.5;
        digits[5] = 45.7;
        digits[6] = -10.5;
        digits[7] = -20.25;
        digits[8] = -40.10;
        digits[9] = -65.55;
        digits[10] = 4.95;
        digits[11] = -34.5;
        digits[12] = -45.70;
        digits[13] = -3.40;
        digits[14] = 55.60;
        digits[15] = -50.40;
        for (Double num : digits) {
            if(num<0) {
                break;
            }
            System.out.println(num + num);

        }


        {

        }


    }
}
