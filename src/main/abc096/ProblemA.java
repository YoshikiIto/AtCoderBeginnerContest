package abc096;

import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int date = sc.nextInt();


        System.out.println(calc(month,date));
    }

    public static int calc(int month, int date) {

        if (month > date) {
            return month - 1;
        } else {
            return month;
        }

    }
}
