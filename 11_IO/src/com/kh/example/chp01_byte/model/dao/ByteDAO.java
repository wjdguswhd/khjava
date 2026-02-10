package com.kh.example.chp01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		FileInputStream fis = null;
		//파일로부터 byte단위로 데이터를 읽어올 수 있는 스트림
		try {
			fis = new FileInputStream("a_byte.txt");
			
			//1. byte배열에 저장한 후 출력
			
			//1-1. byte배열 직접 생성
			
			//File f = new File("a_byte.txt");
			//long size = f.length();
			//byte[] bArr = new byte[(int)size];
			
			//byte[] bArr = new byte[(int)new File("a_byte.txt").length()];
			//fis.read(bArr);
			
			//for(int i = 0; i<bArr.length; i++) {
			//	System.out.print(bArr[i] + " ");
			//}
		
			//1-2.byte배열 반환받기
			
			//byte[] bArr = fis.readAllBytes();
			//for(int i = 0; i<bArr.length; i++) {
			//	System.out.print((char)bArr[i] + " ");
			//}
			
			//2. byte배열을 사용하지 않고 바로 하나씩 읽어출력
			
			int value;
			while((value=fis.read())!=-1) {
				System.out.print((char)value+" ");
			}
			
			//while(fis.read()!=-1) {
			//	System.out.print((char)fis.read()+" ");
			//}
			
			//현재 fis에는 abcdefgcde 저장돼있음.
			//while 조건에서 a를 먼저불러오는데 -1아니기때문에 true -> 코드로 진입
			//코드 내부에는 다음문자를 읽어출력 하기로 되어 있으므로 a의 다음인 b가 출력되며
			//이게 반복되기 때문에 하나씩 건너뛰면서 출력되어 b d f c e 가 출력됨.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void fileOpen2() {
		try (FileInputStream fis = new FileInputStream("a_byte.txt");){
			
			int value;
			while((value=fis.read())!=-1) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave2() {
		try(	FileOutputStream fos = new FileOutputStream("a_byte.txt");) {
			fos.write(97);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fileSave() {
		FileOutputStream fos = null;
		//파일에 byte단위로 데이터를 작성하는 스트림
		try {
			//FileOutputStream fos = new FileOutputStream("a_byte.txt",true); //이어붙이기
			fos = new FileOutputStream("a_byte.txt"); //덮어쓰기
			
			fos.write(97);
			
			byte[] bArr = {98,99,100,101,102,103};
			fos.write(bArr);
			
			fos.write(bArr,1,3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
