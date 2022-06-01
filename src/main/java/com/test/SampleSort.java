package com.test;

public class SampleSort {

    public static void main( String args[])
    {
        int a[] = {0, 2, 1, 2, 0};
        for( int i=0; i < a.length-1; i++) {
            for(int j=i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    break;
                }
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
