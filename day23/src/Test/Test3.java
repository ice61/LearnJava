package Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception {
		File dir1 = Test1.getFile();
		File dir2 = Test1.getFile();
		copy(dir1,dir2);
	}

	public static void copy(File f1,File f2) throws IOException {
		File newdir = new File(f2,f1.getName());
		newdir.mkdir();
		File[] a = f1.listFiles();
		for (File file : a) {
			if(file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newdir,file.getName())));
				int b;
				while((b=bis.read())!=-1)
					bos.write(b);
				bis.close();
				bos.close();
			}else if(file.isDirectory())
				copy(file,newdir);
		}
	}
}
