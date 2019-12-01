package com.heima.regex;

/*
 * 将字符串中的数字排序并转成字符串输出
 * */
public class Test1 {

	public static void main(String[] args) {
		String s = "91 98 46 38 100";
		String[] arr = s.split(" ");
		int[] a = new int[arr.length];
		for(int i=0;i<arr.length;++i) {
			a[i]=Integer.parseInt(arr[i]);
		}
		for(int i=0;i<a.length-1;++i) {
			int temp=i;
			for(int j=i+1;j<a.length;++j) {
				if(a[j]>a[temp])
					temp=j;
			}
			if(temp!=i) {
				a[i]=a[i]^a[temp];
				a[temp]=a[i]^a[temp];
				a[i]=a[i]^a[temp];
			}
		}
		StringBuffer sb = new StringBuffer("");
		for(int i=0;i<a.length;++i) {
			if(i==a.length-1)
				sb.append(a[i]);
			else
				sb.append(a[i]+" ");
		}
		System.out.println(sb);
	}

}
