package experiment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Count {
	
	public String read(String filePath) throws Exception{
		BufferedReader bfr = new BufferedReader(new FileReader(filePath));
		String total = "" ;
		String temp = "";
		while((temp = bfr.readLine()) != null) {
			total = total + " " + temp;
		}
		return total;
	}
	
	public void parse(String str) {
		String[] arr = str.split(" ");
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("class",0);
		tm.put("private", 0);
		tm.put("protected", 0);
		tm.put("public", 0);
		tm.put("final", 0);
		tm.put("static", 0);
		tm.put("this.", 0);
		for (String str1 : arr) {
			if(tm.containsKey(str1)) {
				int num = tm.get(str1) + 1;
				tm.put(str1, num);
			}
		}
		Set<Map.Entry<String, Integer>> s = tm.entrySet();
		for (Map.Entry<String, Integer> entry : s) {
			System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次");
		}
	}
}
