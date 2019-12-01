package Test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		File dir = getFile();
		long length = dirLength(dir);
		System.out.println(length);
	}
	
	public static File getFile() {
		System.out.println("请输入一个路径名");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {
				System.out.println("文件夹路径不存在，请重新输入：");
			}else if(file.isFile()) {
				System.out.println("请重新输入：");
			}else
				return file;
		}
	}

	public static long dirLength(File file) {
		long length = 0;
		File[] subDirs = file.listFiles();
		for (File f : subDirs) {
			if(f.isFile())
				length+=f.length();
			else if(f.isDirectory())
				length+=dirLength(f);
		}
		return length;
	}
}
