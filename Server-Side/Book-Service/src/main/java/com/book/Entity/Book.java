package com.book.Entity;

public class Book {
	
	private String title;
	private String Author;
	private int releaseddate;
	private String category;
	private String image;
	private int price;
	private String publisher;
	private boolean active;
	private String content;
	
	private String username;

	public Book(String title, String author, int releaseddate, String category, String image, int price,
			String publisher, boolean active, String content, String username) {
		super();
		this.title = title;
		Author = author;
		this.releaseddate = releaseddate;
		this.category = category;
		this.image = image;
		this.price = price;
		this.publisher = publisher;
		this.active = active;
		this.content = content;
		this.username = username;
	}

	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getReleaseddate() {
		return releaseddate;
	}

	public void setReleaseddate(int releaseddate) {
		this.releaseddate = releaseddate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}