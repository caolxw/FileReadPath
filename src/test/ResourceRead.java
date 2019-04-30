package test;

import java.io.File;
/*
 * 	“/” 代表的是bin
 */
public class ResourceRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest1();
		
		readTest2();
		
		//Exception
//		File file = new File(ResourceRead.class.getResource("../test3.txt").getFile());
//		ReadUtil.readContext(file);
	}

	public static void readTest2() {
		File file = new File(ResourceRead.class.getResource("/test/test2.txt").getFile());
		ReadUtil.readContext(file);
	}

	public static void readTest1() {
		File file = new File(ResourceRead.class.getResource("/test1.txt").getFile());
		ReadUtil.readContext(file);
	}

}
