package poj;

import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;
public class Ants {
	
	public static int max(int a,int b) {
		
		return a>b?a:b;
	}
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		while(times>0) {
			int len = sc.nextInt();
			int number = sc.nextInt();
			int[] ants = new int[number];
			for(int i=0;i<number;++i) {
				ants[i] = sc.nextInt();
			}
			//下面计算最短时间和最长时间
			int min=0,max=0;
			for(int i = 0;i < ants.length;++i) {
				if(min<min(ants[i], len-ants[i]))
					min = min(ants[i], len-ants[i]);
				if(max<max(ants[i],len-ants[i]))
					max = max(ants[i],len-ants[i]);
			}
			System.out.println(min + " " + max);
			times--;
		}
	}

}
