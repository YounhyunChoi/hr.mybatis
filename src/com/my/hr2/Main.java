package com.my.hr2;

import com.my.hr2.dao.LaborerDao;
import com.my.hr2.dao.LaborerDaoImpl;
import com.my.hr2.presentation.Console;
import com.my.hr2.presentation.LaborerIo;
import com.my.hr2.service.LaborerService;
import com.my.hr2.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl();
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end.");
	}
}
