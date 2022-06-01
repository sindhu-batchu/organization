package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTest {

    public static void main(String args[]) {
        int n[] = {1,0,1,0,0,1,1};
        int length = n.length;
        int pivot = 0;
        if(length % 2 == 0) {
            pivot = length/2;
        } else {
            pivot = (length-1)/2;
        }
        for( int i=0, j=length-1; i < pivot; i++, j--) {
            int temp = n[pivot];
            if(n[i] < n[pivot]) {
                n[pivot] = n[i];
                n[i] = temp;
            }
            temp = n[pivot];
            if(n[j] > n[pivot]) {
                n[pivot] = n[j];
                n[j] = temp;
            }
        }
        for( int i=0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public class Employee implements Comparable<Employee> {
        double salary;

        @Override
        public int compareTo(Employee o) {
            if(this.salary > o.salary) {
                return 1;
            } else if(this.salary < o.salary) {
                return -1;
            }
            return 0;
        }
    }
}
