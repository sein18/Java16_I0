package com.Io.part03_add.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamTest {
	public void fileSave() {
//		BufferedWriter bw = null;
//		FileWriter fw =null;	
		
//		fw = new FileWriter("sample3.txt");
//		bw = new BufferedWriter(fw);

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("sample3.txt"));
			
			bw.write("æ»≥Á«œººø‰.\n");
			bw.write("π›∞©Ω¿¥œ¥Ÿ.\n");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {

		try (BufferedReader br = new BufferedReader(new FileReader("sample3.txt"));) {

			String tmp = null;
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
