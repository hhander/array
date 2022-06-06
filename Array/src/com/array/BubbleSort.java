package com.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,5};
        for (int i = 0; i < arr.length - 1; i++)
        {
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
                if(flag == true)
                {
                    break;
                }
            }
        }
        shuffle.for_each(arr);
    }
}
