package com.company;

public class AverageSalary {
    public static double average(int[] salary) {

        //find the min/max
        int min = salary[0];
        int max = salary[0];
        double total = 0;
        for (int value : salary) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            total += value;
        }
        return ((total - min - max) / (salary.length - 2));
    }
}
