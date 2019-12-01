package com.heima.file;

import java.io.File;

public class Demo1_File {

	public static void main(String[] args) {
		File file = new File("F:\\java资料\\Java学习视频\\day2_video\\02.02_Java语言基础(进制概述和二,八,十六进制图解).avi");
		System.out.println(file.exists());
	}

}
