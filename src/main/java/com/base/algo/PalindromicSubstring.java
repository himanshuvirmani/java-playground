package com.base.algo;

/**
 * Created by himanshu.virmani on 09/08/17.
 */
public class PalindromicSubstring
{
    private static String string =  "abc";
    public static void main(String[] args) {
        findSubstrings(string,0,1);
    }

    private static void findSubstrings(String string, int start, int end)
    {
        if(end == string.length()) return;
        for (int i=0;i<string.length();i++) {
            findSubstrings(string,i,end+1);
            if (end < string.length()) System.out.println(string.substring(i,end+1));
        }
    }
}
