package ex_01_JavaBasics;

public class TaskJune1_Array_OddEven_Q5 {
    public static void main(String[] args) {

        int[] num={5,90,3,4,7};
       // int Odd,even=num[0];

        for(int i=0;i<num.length;i++) {
            if (num[i]%2==0) {

                System.out.println("Even numbers are"+num[i]);
            }}
        for(int i=0;i<num.length;i++){
             if(num[i]%2!=0){

              System.out.println("odd numbers are"+num[i]);
           }}

        }



    }

