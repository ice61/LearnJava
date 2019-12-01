package Test;

import java.io.File;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		File dir = getFile();
		deleteDir(dir);
	}
	public static File getFile() {
		System.out.println("������һ��·����");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {
				System.out.println("�ļ���·�������ڣ����������룺");
			}else if(file.isFile()) {
				System.out.println("���������룺");
			}else
				return file;
		}
	}
	public static void deleteDir(File dir) {
		File[] subDirs = dir.listFiles();
		for (File f : subDirs) {
			if(f.isFile())
				f.delete();
			else if(f.isDirectory()) {
				deleteDir(f);
			}
		}
		dir.delete();
	}
}
