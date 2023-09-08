package com.sgtesting.stringdemo;

import java.io.FileOutputStream;

public class fileinputoutput {
	


	public static void main(String[] args) {
		writecontent();
		
	}
		private static void writecontent() {
			FileOutputStream fout = null;
			try {
				fout = new FileOutputStream("F:\\Demo\\welcome2.txt",true);
				String str = "java is a programming language";
				str+= "used for developing";
				byte b[] = str.getBytes();
				fout.write(b);
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					fout.close();
				}catch(Exception e) {
					e.printStackTrace();
				}

				
		}

	
 
	
}
}
