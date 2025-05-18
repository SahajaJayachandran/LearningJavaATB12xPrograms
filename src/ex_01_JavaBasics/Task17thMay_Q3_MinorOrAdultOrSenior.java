package ex_01_JavaBasics;

public class Task17thMay_Q3_MinorOrAdultOrSenior {
    public static void main(String[] args) {
        int age=7;
        String S=(age>18)?(age>65?"Senior":"Adult"):"Minor";
        System.out.println("You are a: " + S);

    }
}
