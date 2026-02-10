package com.kh.example.chap02_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			fw.write("와, IO 재밌다!");
			fw.write(65);
			fw.write(' ');
			char[] cArr = {'a', 'p', 'p' , 'l', 'e'};
			fw.write(cArr);
 			 
			//FileWriter, FileReader buffer 사용
			//버퍼에 있는 데이터가 꽉 차야지만 파일로 데이터를 내보냄
			//버퍼에 데이터가 꽉 차기 전에 먼저 버퍼에 있는 데이터 밀기
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		try(	FileReader fr = new FileReader("b_char.txt");) {
			
			//byte배열 미사용
			//int value;
			//while((value=fr.read()) != -1) {
			//	System.out.print((char)value);
			//}
			
			//byte배열 사용
			int size = (int)new File("b_char.txt").length();
			char[] chArr = new char[size];
			fr.read(chArr);
			for(int i=0; i<chArr.length; i++) {
				System.out.print((char)chArr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
