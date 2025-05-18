package ex_01_JavaBasics;

import java.util.Collections;

public class Task17thMay_Q2_MaxNum {
    public static void main(String[] args) {

int n1=103;
int n2=200;
int n3=900;
int MaxNum = ((n1>n2) && (n1>n3))?n1:((n2>n3)?n2:n3);
        System.out.println("The Maximum Number is " +MaxNum);


    }
}
