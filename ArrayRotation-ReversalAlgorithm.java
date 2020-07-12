/*
Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void rotateArray(int arr[], int d, int len){
        if(d==0){
            return ;
        }
    
        reverseArray(arr,0,d);
        reverseArray(arr,d,len);
        reverseArray(arr, 0, len);
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int arr[], int start, int end){
        int temp; 
        end--;
        while (start < end) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0; i<test; i++){
		    int len = sc.nextInt();
		    int d = sc.nextInt();
		    int arr[] = new int[len];
		    for(int j=0; j<len; j++){
		        arr[j] = sc.nextInt();
		    }
		    System.out.println("d="+d+" len="+len);
		    d = d%len;
		    rotateArray(arr,d,len);
		}
	}
}
