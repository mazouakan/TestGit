package test_java;

import java.io.*;


public class CopyFile {

	public static void main(String[] args) throws IOException{

		FileInputStream in = null ;
		FileOutputStream out = null;
		
		try {
			
		in = new FileInputStream("H:\\auto_formation\\test_java\\input.txt");	
		out = new FileOutputStream("H:\\auto_formation\\test_java\\output.txt");
		System.out.println(in.available());
		
		int c;
		while((c = in.read()) != -1)
		{
			out.write(c);
		}
		
		}finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	     }
	}

}
