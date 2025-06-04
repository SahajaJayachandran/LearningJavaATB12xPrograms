package ex_01_JavaBasics;



public class TaskJune1_Array_sum_Q4 {
    public static void main(String[] args) {
        int[] num={5,90,3,4,7};
        int sum=0;
        for(int i=1;i<num.length;i++) {
            sum=sum+num[i];
        }

        System.out.println("The sum is: " + sum);

    }
    }

