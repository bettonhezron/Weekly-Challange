package com.hezron;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        //Traverse through all array elements
        for (int i = 0; i < arr.length; i++){

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


    }

    public static void main(String[] args) {
        int[] exampleArray = {64,25,12,22,11};
        selectionSort(exampleArray);

        //print sorted array
        for (int num : exampleArray){
            System.out.println(num + " ");
        }

    }
}
