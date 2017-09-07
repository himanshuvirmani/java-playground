package com.base.algo;

/**
 * Created by himanshu.virmani on 09/08/17.
 */

//Wrong answer
public class ClimbStairs
{
    public static void main(String[] args) {
        System.out.println(countClimbStairsWays(3));
    }

    private static int countClimbStairsWays(int steps)
    {
        int temp=0;
        if(steps<=0) return 0;
        for(int i=1;i<3;i++) {
            temp = temp + countClimbStairsWays(steps - i);
        }
        return temp+1;
    }
}
