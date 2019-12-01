package com.heima.stringbuffer;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3_StringBuffer {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		System.out.println(find(a,x));
		System.out.println(Arrays.binarySearch(a, x));
	}

	private static int find(int[] a,int target) {
		int min=0,max=a.length-1,mid=(max+min)/2;
		while(true) {
			if(target>a[max]||target<a[0])
				return -1;
			if(a[mid]==target)
				break;
			else if(target>a[mid]) {
				min=mid+1;
				mid=(max+min)/2;
			}else if(target<a[mid]) {
				max=mid-1;
				mid=(max+min)/2;
			}
		}
		return mid;
	}
}
