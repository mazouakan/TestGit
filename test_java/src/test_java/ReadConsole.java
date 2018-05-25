package test_java;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

	public static void main(String[] args) throws IOException{

		InputStreamReader in = null;
		
		try {
		
		in = new InputStreamReader(System.in);	
		System.out.println("Enter characters, 'q' to quit.");
		char c;
		do{
			c = (char) in.read();
			System.out.println(c);
		}while(c != 'q');

		}
		finally {
			if(in != null)
				in.close();
		}
	}

}
