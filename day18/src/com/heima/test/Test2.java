package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		ArrayList<String> poker = new ArrayList<>();
		for (String n : num) {
			for(String c :color) {
				poker.add(c+n);
			}
		}
		poker.add("大王");
		poker.add("小王");
		Collections.shuffle(poker);
		ArrayList<String> gaojin = new ArrayList<>();
		ArrayList<String> aci = new ArrayList<>();
		ArrayList<String> me = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for(int i=0;i<poker.size();++i) {
			if(i>=poker.size()-3) {
				dipai.add(poker.get(i));			
			}else if(i%3==0) {
				gaojin.add(poker.get(i));
			}else if(i%3==1) {
				aci.add(poker.get(i));
			}else if(i%3==2){
				me.add(poker.get(i));
			}
		}
		System.out.println(dipai);
		System.out.println(gaojin);
		System.out.println(aci);
		System.out.println(me);
	}

}
