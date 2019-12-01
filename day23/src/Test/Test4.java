package Test;

import java.io.File;

public class Test4 {

	public static void main(String[] args) {
		File file = Test1.getFile();
		print(file,0);
	}

	public static void print(File file,int level) {
		File[] all = file.listFiles();
	    
		for (File f : all) {
			if(f.exists()) {
				for(int i=0;i<=level;++i)
					System.out.print("\t");
				System.out.println(f);
			}
			if(f.isDirectory())
				print(f,level+1);
		}
	}
}
