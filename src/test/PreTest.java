package test;

import java.io.File;

public class PreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/");
        System.out.println("/ 代表的绝对路径为：" + file.getAbsolutePath());

        File file1 = new File(".");
        System.out.println(". 代表的绝对路径为" + file1.getAbsolutePath());

	}

}
/**
result:
/ 代表的绝对路径为：D:\
. 代表的绝对路径为D:\eclipse-workspace\SrcTest\.
**/