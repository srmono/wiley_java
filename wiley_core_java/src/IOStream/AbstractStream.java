package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AbstractStream {
	public static void main(String[] args) throws IOException {
		
		OutputStream fout = new FileOutputStream("I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\data4.txt");
		
		String str = "Wiley fullstack project ILT Sessions";
		
		byte[] b = str.getBytes();
		
		System.out.println();
		
		fout.write(b);
		
		fout.flush();
		fout.close();
		
		
//		InputStream fin = new FileInputStream(
//				"I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\data4.txt");
//
//		int i = 0;
//
//		while ((i = fin.read()) != -1) {
//			System.out.println((char) i);
//		}
//		fin.close();
	}
}
