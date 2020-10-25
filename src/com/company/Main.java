package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = 0;
        int n = num.nextInt();
        int l =n-4;
        String space="";
        int q = -1;
        int y = -1;
        for (int s =n;s>l; s--) {
            y=y+2;
            q++;
            for (int j = n-1; j < n; j++)
                System.out.print(space );
            for (int k = 0; k <= q; k++)
                System.out.print((k >= 10) ?+ k : " " + k);
                String nbv ="";
                nbv =nbv+" "+q;
                System.out.print(nbv.repeat((n-y)*2-1));

            for (int k = q; k >= x; k--)
                System.out.print((k >= 10) ?+ k :" " + k);
            System.out.println();
            space += "  ";
        }
        for (int i = l-1; i >= x; i--) {

            for (int j = l-1; j < l; j++)
                    System.out.print(space );

            for (int k = 0; k <= i; k++)
                System.out.print((k >= 10) ?+ k : " " + k);

            for (int k = i-1; k >=x; k--)
                System.out.print((k >= 10) ?+ k :" " + k);
            System.out.println();
            space += "  ";
        }
    }
}