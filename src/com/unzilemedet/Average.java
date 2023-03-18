package com.unzilemedet;

public class Average {
    public static void main(String[] args) {

             int[]  list = {1,2,3,4,5};
             double sum =0.0;

             for (int i=0; i< list.length ; i++)

                sum += list[i];
             double average = sum / list.length;
             System.out.println(average);


             double mean = 0.0;
             for (int i = 0; i < list.length; i++){
             mean += 1.0 /(list[i]);
             }

             double harmonicMean = list.length / mean;
             System.out.println(harmonicMean);
    }
}
