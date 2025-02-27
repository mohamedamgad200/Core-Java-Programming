package chapter3;

import java.util.Random;

public class LabExercise1 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000); // Random numbers between 0 and 999
        }
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;
        for(int i:randomArray)
        {
            if(i>maxNumber)
            {
                maxNumber=i;
            }
            if(i<minNumber)
            {
                minNumber=i;
            }
        }
        System.out.println("Max number is "+ maxNumber);
        System.out.println("Min number is "+minNumber);
    }
}
