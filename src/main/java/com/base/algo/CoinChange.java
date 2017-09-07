package com.base.algo;

/**
 * Created by himanshu.virmani on 09/08/17.
 */
public class CoinChange
{
    private static int number = 24;
    private static int[] coins = {1,2,5};
    private static int[] mem = new int[24];
    public static void main(String[] args) {
        System.out.println("Answer is " + findMinCoinsAndQuantity(number));
    }


    private static int findMinCoinsAndQuantity(int number) {
        if(number == 0) return 0;
        int sum = Integer.MAX_VALUE;
        if(mem[number-1] != 0) {
            return mem[number-1];
        }

        for(int i = 0; i < coins.length;i++) {
            if(coins[i] <= number) {
                int temp =findMinCoinsAndQuantity(number - coins[i]);

                if ( temp != Integer.MAX_VALUE && temp + 1 < sum) {
                    sum = temp + 1;
                    mem[number-1]=sum;
                }
            }
        }
        return sum;
    }
}
