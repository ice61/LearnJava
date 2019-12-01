package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set; 
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
		TreeMap<Character, Integer> tm = new TreeMap<>();
		int n;
		while((n=br.read())!=-1) {
			char c = (char)n;
			if(tm.containsKey(c)) {
				tm.put(c, tm.get(c)+1);
			}
			else {
				tm.put(c, 1);
			}	
		}
		br.close();
		Set<Character> s = tm.keySet();
		BufferedWriter bw = new BufferedWriter(new FileWriter("new yyy.txt"));
		for (Character ch : s) {
			switch(ch) {
			case '\t':bw.write("\\t"+"������"+tm.get(ch)+"��");
			break;
			case '\n':bw.write("\\n"+"������"+tm.get(ch)+"��");
			break;
			case '\r':bw.write("\\r"+"������"+tm.get(ch)+"��");
			break;
			default:bw.write(ch+"������"+tm.get(ch)+"��");
			break;
			}
			bw.newLine();
		}
		bw.close();
	}
}
