package com.interviewMe;

public class Main {

    public static void main(String[] args) {

        int a[]= {1,5,2,4,8,9};

        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[j]<a[i]){
                    int temp= a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int num:a) {
            System.out.println(num);
        }



	// write your code here
    }
}
