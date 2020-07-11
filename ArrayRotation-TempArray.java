/* Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements,
N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements. */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void rotateArray(int a[], int d, int len){
        int b[] = new int[len];
        int k=0;
        for(int i=0; i<d; i++){
            b[i] = a[i];
        }
        for(int i=d; i<len; i++){
            a[k] = a[k+d];
            k++;
        }
        for(int i=0; i<d; i++){
            a[k++] = b[i];
        }
        for(int i=0; i<len; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0; i<test; i++){
		    int len = sc.nextInt();
		    int d = sc.nextInt();
		    int arr[] = new int[len];
		    for(int j=0; j<len; j++){
		        arr[j] = sc.nextInt();
		    }
		    rotateArray(arr,d,len);
		}
	}
}
