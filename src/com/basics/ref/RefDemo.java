package com.basics.ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method reference Demo");
//Provide the implementation of IWork
//classname::methodname		
	IWork iwork = Project::projectProgress;
	iwork.doProject();
	
	//IWork iwork1 = Project::oddto100;
	//iwork1.doProject();
	
	Runnable runnable = Project::threadTask;
	Thread t1 = new Thread(runnable);
	t1.start();
	
	/**Runnable runnable1 = Project::oddto100;
	Thread t2 = new Thread(runnable1);
	t2.start();**/
	}
	}


