package com.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayLuckyNum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(0,21);
        }
        out:
        while(true)
        {
            boolean flag = false;
            System.out.println("请输入猜的数字");
            int guess = sc.nextInt();
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] == guess)
                {
                    System.out.println("恭喜你猜中了出现在" + (i+1) + "的位置" );
                    flag = true;
                    for (int j = 0; j < arr.length; j++)
                    {
                        System.out.print(arr[j] + " ");
                    }
                    break out;

                }
            }
            if(flag == true)
            {
                break;
            }
            System.out.println("猜错了");

        }
    }
}
