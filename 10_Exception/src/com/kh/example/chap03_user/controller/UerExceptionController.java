package com.kh.example.chap03_user.controller;

import com.kh.example.chap03_user.model.exception.MyException;

public class UerExceptionController {
	public void method() throws MyException {
		throw new MyException();
	}
}
