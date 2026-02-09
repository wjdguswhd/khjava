package com.kh.example.chap02_tryCatch.controller;

import java.io.EOFException;
import java.io.IOException;

public class TryCatchConroller {
	public void method1() {
		//method1()에서 위임받은 예외 직접 처리
		// IOException의 후손인 EOFException은 IOException 위에만 있으면됨
		//단, catch절 5개 작성 : IOException, RuntimeException, EOFException,Exception, NullPointerException
		//                        상속관계에 들어가지 않으면 위치 상관x   모든 예외의 최고 조상은 맨 아래
		//                       RuntimeException의 후손인 NullPointerException은 RuntimeException위에만 있으면 됨
		try {
			method2();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("예외 발생 여부와 상관 없이 무조건 수행....");
		}
		
	}
	public void method2() throws IOException{
		throw new IOException("여기서도 message 전달 가능!");
	}
}
