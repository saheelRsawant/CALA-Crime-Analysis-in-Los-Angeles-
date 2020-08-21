package com.service;

import com.bean.*;
import com.dao.Dao;

import java.util.*;

public class Service {

	Dao d = new Dao();
	public ArrayList<Query_Output> retrieve(){
		return d.retrieve();
	}

	public ArrayList<Query_Output> retrieve2() {
		// TODO Auto-generated method stub
		System.out.println("Entering Query 2 service");
		return d.retrieve2();
	}
	
	public ArrayList<Query_Output> retrieve3() {
		// TODO Auto-generated method stub
		System.out.println("Entering Query 3 service");
		return d.retrieve3();
	}
	
	public ArrayList<Query_Output> retrieve4() {
		// TODO Auto-generated method stub
		System.out.println("Entering Query 4 service");
		return d.retrieve4();
	}
	
	public ArrayList<Query_Output> retrieve5() {
		// TODO Auto-generated method stub
		System.out.println("Entering Query 5 service");
		return d.retrieve5();
	}
}
