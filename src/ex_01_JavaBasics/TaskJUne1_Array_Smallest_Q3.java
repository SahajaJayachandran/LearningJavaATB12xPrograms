package ex_01_JavaBasics;

public class TaskJUne1_Array_Smallest_Q3 {
    public static void main(String[] args) {

            int[] num={5,90,3,4,7};
            int smallest=num[0];
            for(int i=1;i<num.length;i++) {
                if (num[i] < smallest) {
                    smallest = num[i];
                }
            }

            System.out.println("The smallest number is: " + smallest);

        }
    }

