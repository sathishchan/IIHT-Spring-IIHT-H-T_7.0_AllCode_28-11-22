package com.basics.interfaces;

interface manufacturing {
	void made();
}

interface sales {
	void sold();
}

public class product implements sales, manufacturing {

	public static void main(String[] args) {
		
		product soap=new product();
		soap.made();
		soap.sold();
	}
		public void made() {
			System.out.println("The Product has been Made");
		}
		
		public void sold() {
			System.out.println("The Product has been Sold");
		}
	}




