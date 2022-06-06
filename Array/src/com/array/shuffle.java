package com.array;

import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        Random ra = new Random();
        int[] stuffNum = new int[]{22,33,35,13,88};
        for (int i = 0; i < stuffNum.length; i++)
        {
            exc(stuffNum, ra.nextInt(stuffNum.length),i );
        }
        for_each(stuffNum);
    }


    public static void exc(int[] arr,int a,int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void for_each(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
