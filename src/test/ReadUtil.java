package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUtil {
	public static void readContext(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
	        String len = null;
        
			while ((len=br.readLine())!=null){
			    System.out.println(len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
