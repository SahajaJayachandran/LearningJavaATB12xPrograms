package ex_01_JavaBasics;

public class TaskJune1_Array_Largest_Q2 {
    public static void main(String[] args) {
        int[] num={5,90,3,4,7};
        int largest=num[0];
        for(int i=1;i<num.length;i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

                System.out.println("The largest number is: " + largest);

        }
    }

