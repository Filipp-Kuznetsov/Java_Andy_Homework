package com.company;

public class ArrayChoice {

  int[]arr;
 public int[] getArray(int arrayEnd){
      switch (arrayEnd){
          case 1: arr=new RandomArray().getArray(); break;
          case 2: arr=new UserArray().getArray(); break;

      }
      return arr;
    }

}
