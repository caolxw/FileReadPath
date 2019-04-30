package test;

import java.io.File;
/*
 *  “” 空代表的是 这个Java项目的根目录  SrcTest
 *   不推荐使用
 */
public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest1();
		
		readTest2();
	}

	public static void readTest2() {
		File file = new File("src/test/test2.txt");
		ReadUtil.readContext(file);
	}
	
	public static void readTest1() {
		File file = new File("src/test1.txt");
		ReadUtil.readContext(file);
	}

}
