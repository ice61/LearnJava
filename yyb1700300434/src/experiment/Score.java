package experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Score {
	
	public void readWrite(String read,String write) throws Exception{
		BufferedReader bfr = new BufferedReader(new FileReader(read));
		BufferedWriter bfw = new BufferedWriter(new FileWriter(write));
		String str = "";
		while((str = bfr.readLine()) != null) {
			double totalScore = calculate(str);
			str = str + " ×Ü·Ö£º" + totalScore + "·Ö";
			bfw.write(str);
			bfw.newLine();
		}
		bfr.close();
		bfw.close();
		
	}
	
	private double calculate (String s) {
		Scanner sc = new Scanner(s);
		sc.useDelimiter("[^0123456789.]+");
		double totalScore = 0;
		while(sc.hasNext()) {
			try {
				double score = sc.nextDouble();
				totalScore += score;
			}catch (Exception e) {
				sc.next();
			}
				
		}	
		return totalScore;
	}
}
