package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [][] twoDimArray = new int[12][8];
        for(int i = 0; i< twoDimArray.length;i++){
            for(int j = 0;j<twoDimArray[i].length;j++) twoDimArray[i][j]= (int)(Math.random()*51);
        }
        //System.out.println(Arrays.deepToString(twoDimArray));
        int [] sumArray = new int[12];
        for(int i = 0; i< twoDimArray.length;i++) {
            int sum = 0;

            for (int j = 0; j < twoDimArray[i].length; j++) sum += twoDimArray[i][j];

            sumArray[i] = sum;
        }
        //System.out.println(Arrays.toString(sumArray));
        int max = 0;
        for(int sums:sumArray)
            if(sums>max) max = sums;
        //System.out.println(max);
        
        int finalIndex = 0;
        for(int k = 0; k < sumArray.length;k++)if(sumArray[k]==max) finalIndex = k;
                                
            System.out.println(finalIndex);
    }
}
