package com.heima.regex;

public class Demo2_Regex {

	public static void main(String[] args) {
		/*String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";
		String[] arr = s.split(regex);
		for(int i=0;i<arr.length;++i)
			System.out.println(arr[i]);*/
		String s = "我我....我...我.要...要要...要学...学学....";
		String s2=s.replaceAll("\\.+","");
		String s3 = s2.replaceAll("(.)\\1+","$1");
		System.out.println(s3);
	}

}
