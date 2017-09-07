package com.base.algo;

/**
 * Created by himanshu.virmani on 09/08/17.
 */
public class MetricMinimumPath
{
    private static int[][] table = new int[3][3];
    private static int[][] answer;

    static {
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 8;
        table[1][2] = 2;
        table[2][0] = 1;
        table[2][1] = 5;
        table[2][2] = 3;
    }

    public static void main(String args[])
    {
        System.out.println(findMetricMinPath(table, 2, 2));
    }

    private static int findMetricMinPath(int[][] table, int i, int j)
    {
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return table[0][0];
        int minCost = 0;
        minCost = table[i][j] +  Math.min(findMetricMinPath(table,i-1,j),findMetricMinPath(table,i,j-1));

        return minCost;
    }
}
