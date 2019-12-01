package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		HashMap<Integer, String> poker = new HashMap<>();
		int index = 0;
		for(String s1 : num) {
			for(String s2 : color) {
				poker.put(index,s2+s1);
				index++;
			}
		}
		poker.put(index, "小王");
		index++;
		poker.put(index,"大王");
		//System.out.println(poker);
		ArrayList<Integer> pokerIndex = new ArrayList<>();
		pokerIndex.addAll(poker.keySet());
		TreeSet<Integer> weixing = new TreeSet<>();
		TreeSet<Integer> aci= new TreeSet<>();
		TreeSet<Integer> boluo=new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		Collections.shuffle(pokerIndex);
		for(int i=0;i<pokerIndex.size();++i) {
			if(i>=pokerIndex.size()-3)
				dipai.add(pokerIndex.get(i));
			else if(i%3==0) {
				weixing.add(pokerIndex.get(i));
			}else if(i%3==1) {
				aci.add(pokerIndex.get(i));
			}else {
				boluo.add(pokerIndex.get(i));
			}
		}
		look(weixing,poker);
		look(aci,poker);
		look(boluo,poker);
		look(dipai,poker);
	}
	public static void look(TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		for (Integer i : ts) {
			System.out.print(hm.get(i)+" ");
		}
		System.out.println();
	}
}
