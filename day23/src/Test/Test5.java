package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Test5 {

	public static void main(String[] args) throws IOException {
		BigInteger result = new BigInteger("1");
		for(int i = 1;i<=1000;++i) {
			BigInteger b = new BigInteger(i+"");
			result = result.multiply(b);
		}
		String s = result.toString();
		int count = 0;
		for(int i=0;i<s.length();++i) {
			if('0'==s.charAt(i))
				count++;
		}
		System.out.println(count);
	}
}