package abc095;

import java.util.*;


/*
https://beta.atcoder.jp/contests/abc095/tasks/abc095_a
 */

public class ProblemA {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String topping = sc.nextLine();
        System.out.println(calcAmount(topping));
    }

    public static String calcAmount(String topping) {
        switch (topping) {
            case "ooo":
                return "1000";
            case "oox":
                return "900";
            case "oxo":
                return "900";
            case "xoo":
                return "900";
            case "oxx":
                return "800";
            case "xox":
                return "800";
            case "xxo":
                return "800";
            case "xxx":
                return "700";
            default:
                return "";
        }
    }

    public static String calcAmount2(String topping) {
        return "";
    }

}
