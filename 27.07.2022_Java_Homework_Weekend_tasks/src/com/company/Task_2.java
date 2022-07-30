package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        /* 2.   Дан список  в котором записаны результаты подбрасывания монетки
         (true\false соответственно орел\решка)
         Необходимо вычислить самую длинную последовательность «орлов».
         {true,true,false,true,false,true,true,true,false}->3
         */

        List<Boolean>booleanList=List.of(true,true,false,true,false,true,true,true,false);
        System.out.println("Max value 'True' in List is: "+maxTrueCount(booleanList));

    }
    public static int maxTrueCount(List<Boolean>booleanList){
        int maxValue=0;
            int count =0;
        for (int i=0;i<booleanList.size();i++) {
            if (booleanList==null && booleanList.isEmpty()){
                return 0;
            }else {
                if (booleanList.get(i)==true) count++;
                maxValue=count;
                if (booleanList.get(i)==false) count=0;
            }

        }
        return maxValue;
    }
}
