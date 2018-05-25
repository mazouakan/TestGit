package test_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest {

	public static void main(String[] args) {
	
		try {
			
			byte bWrite[] = {11,21,3,40,5};
			OutputStream os = new FileOutputStream("H:\\auto_formation\\test_java\\outputStream.txt");
			for(int i=0; i<bWrite.length; i++)
			{
				os.write(bWrite[i]);
			}
			os.close();
			
			InputStream is = new FileInputStream("H:\\auto_formation\\test_java\\outputStream.txt");
			int size = is.available();
			for(int j=0; j<size; j++)
			{
				System.out.println((char)is.read() + " ");
			}
			is.close();
			
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
