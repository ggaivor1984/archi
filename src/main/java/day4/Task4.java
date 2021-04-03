package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
    int [] hundred  = new int[100];
        for(int i = 0; i< hundred.length;i++) hundred[i] = (int)(Math.random()*10001);
        System.out.println(Arrays.toString(hundred));

        int sum = 0;
        int counter = 0;
        for (int i = 0; i< hundred.length-2;i++) {
            sum = hundred[i] + hundred[i + 1] + hundred[i + 2];
            counter++;
        }
            System.out.println(counter);


        int [] allSums = new int[counter];
        for (int i = 0; i< hundred.length-2;i++) {
            allSums[i] = hundred[i] + hundred[i + 1] + hundred[i + 2];
        }
        System.out.println(Arrays.toString(allSums));

        int max = 0;
        for(int maxSum:allSums)
            if(maxSum>max) max = maxSum;
        System.out.println(max);

        int neededIndex = 0;
        for(int k = 0; k < allSums.length;k++)if(allSums[k]==max) neededIndex = k;

        System.out.println(neededIndex);




    }
}
