package com.user.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String image;
	private String title;
	private String category;
	private Float price;
	private String author;
	private String publisher;
	private LocalDate publishedDate;
	
	@CreationTimestamp
	private LocalDateTime createdTime;
	@UpdateTimestamp
	private LocalDateTime updatedTime;
	private Boolean is_active;
	
	public Boolean getIs_active() {
		return is_active;
	}


	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}


	@OneToMany(cascade = CascadeType.ALL)
	private Set<BookContent> bookContent;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<BookSubscription> bookSubscription;


	public Book(Long id, String image, String title, String category, Float price, String author, String publisher,
			LocalDate publishedDate, LocalDateTime createdTime, LocalDateTime updatedTime,
			Boolean isActive, Set<BookContent> bookContent, Set<BookSubscription> bookSubscription) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.category = category;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.is_active = isActive;
		this.bookContent = bookContent;
		this.bookSubscription = bookSubscription;
	}


	public Book() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public LocalDate getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}


	public LocalDateTime getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}


	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(LocalDateTime updatedTime) {
		this.updatedTime = updatedTime;
	}


	


	public Set<BookContent> getBookContent() {
		return bookContent;
	}


	public void setBookContent(Set<BookContent> bookContent) {
		this.bookContent = bookContent;
	}


	public Set<BookSubscription> getBookSubscription() {
		return bookSubscription;
	}


	public void setBookSubscription(Set<BookSubscription> bookSubscription) {
		this.bookSubscription = bookSubscription;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", image=" + image + ", title=" + title + ", category=" + category + ", price="
				+ price + ", author=" + author + ", publisher=" + publisher + ", publishedDate=" + publishedDate
				+ ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", isActive="
				+ is_active + ", bookContent=" + bookContent + ", bookSubscription=" + bookSubscription + "]";
	}

	
}