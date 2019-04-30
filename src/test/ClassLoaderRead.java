package test;

import java.io.File;
/*
 *  “ ” 空代表的是bin
 */
public class ClassLoaderRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest1();
		
		readTest2();
	}

	public static void readTest2() {
		File file = new File(Thread.currentThread().getContextClassLoader().getResource("test/test2.txt").getFile());
		ReadUtil.readContext(file);
	}

	public static void readTest1() {
		File file = new File(Thread.currentThread().getContextClassLoader().getResource("test1.txt").getFile());
		ReadUtil.readContext(file);
	}

}
