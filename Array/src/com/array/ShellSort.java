package com.array;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,1};
        int h = 1;
        while(h<(arr.length/2))
        {
            h = 2*h +1;
        }
//        System.out.println(h);
        while(h>=1)
        {
            for (int i = h; i < arr.length; i++)
            {
                for (int j = i; j >= h; j-=h)
                {
                    if(arr[j]<arr[j-h])
                    {
                        int tmp = arr[j-h];
                        arr[j-h] = arr[j];
                        arr[j] = tmp;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            h = h/2;
        }
        shuffle.for_each(arr);
    }
}
