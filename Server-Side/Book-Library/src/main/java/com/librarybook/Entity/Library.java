package com.librarybook.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String bookname;
	private String bookauthor;
	private Float bookprice;
	private String bookgenre;
	private Boolean borrowedstatus;
	
	public Library(Integer id, String bookname, String bookauthor, Float bookprice, String bookgenre,
			Boolean borrowedstatus) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.bookgenre = bookgenre;
		this.borrowedstatus = borrowedstatus;
	}

	public Library() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public Float getBookprice() {
		return bookprice;
	}

	public void setBookprice(Float bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookgenre() {
		return bookgenre;
	}

	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}

	public Boolean getBorrowedstatus() {
		return borrowedstatus;
	}

	public void setBorrowedstatus(Boolean borrowedstatus) {
		this.borrowedstatus = borrowedstatus;
	}
	
}
