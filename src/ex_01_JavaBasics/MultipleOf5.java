package ex_01_JavaBasics;

public class MultipleOf5 {
    public static void main(String[] args) {
        byte i, j=5;
        for (i=1;i<=10;i++) {
            System.out.printf("%d*%d=%d\n", j, i, j * i);
        }
    }
}
