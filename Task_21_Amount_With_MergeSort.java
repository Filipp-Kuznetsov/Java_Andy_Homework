package com.company;

import java.util.Arrays;

public class Task_21_Amount_With_MergeSort {

        public static void main(String[] args) {
            int [] arr1= {0,1,2,3,4,1,9,3,7,5};
            int [] arr2= {-3,1,2,-3,4,-8,-2,-1,5};
            //System.out.println(countElements(arr1, arr2));

            arrMergeSort(arr1);
            arrMergeSort(arr2);
            System.out.println("Array before sorting: "+ Arrays.toString(arr1));
            System.out.println("Array after sorting: "+Arrays.toString(arr2));
            System.out.println("The same amount of elements are: "+countSumElements(arr1,arr2));
        }

        public static int[] findBigestArray(int []arr1, int [] arr2){
            if (arr1.length-1> arr2.length-1) return arr1;
            else return arr2;
        }

        public static int countElements(int [] arr1 , int [] arr2){
            int equalsElementsCount=0;
            for (int i = 0; i <(findBigestArray(arr1,arr2)).length ; i++) {
                if (arr1[i]==arr2[i]){
                    equalsElementsCount++;
                }
            }
            return equalsElementsCount;
        }

        static void arrMergeSort(int[]arr){
            if (arr.length<2)return;
            int middleArrLength = arr.length/2;
            int[] leftHalfLength=new int[middleArrLength];
            int []rightHalfLength=new int[arr.length-middleArrLength];

            for (int i = 0; i <middleArrLength ; i++) {
                leftHalfLength[i]=arr[i];
            }

            for (int i = middleArrLength; i <arr.length ; i++) {
                rightHalfLength[i-middleArrLength]=arr[i];
            }
            arrMergeSort(leftHalfLength);
            arrMergeSort(rightHalfLength);
            merge(arr,leftHalfLength,rightHalfLength);

        }

        static void merge(int [] inputArr, int [] leftHalfArr,int [] rightHalfArr){
            int leftSize= leftHalfArr.length;
            int rightSize= rightHalfArr.length;
            int inputArrIndex=0, leftHalfIndex=0,rightHalfIndex=0;

            while (leftHalfIndex < leftSize && rightHalfIndex < rightSize ){

                if (leftHalfArr[leftHalfIndex] <= rightHalfArr[rightHalfIndex] ){
                    inputArr[inputArrIndex]=leftHalfArr[leftHalfIndex];
                    leftHalfIndex++;

                }else {
                    inputArr[inputArrIndex] = rightHalfArr[rightHalfIndex];
                    rightHalfIndex++;
                }
                inputArrIndex++;

            }
            while (leftHalfIndex < leftSize ) {
                inputArr[inputArrIndex]=leftHalfArr[leftHalfIndex];

                leftHalfIndex++;
                inputArrIndex++;
            }
            while (rightHalfIndex < rightSize ){
                rightHalfIndex++;
                inputArrIndex++;
            }
        }
        static int countSumElements(int [] arr1 , int [] arr2){
            int count=0;
            for (int i = 0; i < arr1.length ; i++) {
                boolean flag = false;
                for (int j = 0; j <arr2.length ; j++) {
                    flag= arr1[i]==arr2[j];
                    if (flag) count++;
                }

            }
            return count;
        }
    }




