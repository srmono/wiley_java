package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamClass {
	public static void main(String[] args) throws IOException  {
//		FileOutputStream fout = new FileOutputStream("I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\data2.txt");
//		
//		DataOutputStream dos = new DataOutputStream(fout);
//		
//		dos.writeBytes("I am a programmer");
//		dos.flush();
//		dos.close();
		
		FileInputStream fin = new FileInputStream("I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\data2.txt");
		
		DataInputStream dis = new DataInputStream(fin);
		
		int count = fin.available();
		
		byte[] ba = new byte[count];
		
		dis.read(ba);
		
		for(byte b: ba) {
			System.out.println((char)b);
		}
		
		dis.close();
		fin.close();
	}

}
