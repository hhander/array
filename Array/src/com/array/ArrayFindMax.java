package com.array;

public class ArrayFindMax {
    public static void main(String[] args) {
        int[] arr = new int[]{15,9000,10000,20000,9500,-5};
        int max = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        System.out.println("最大值为" + arr[max]);

    }


}
