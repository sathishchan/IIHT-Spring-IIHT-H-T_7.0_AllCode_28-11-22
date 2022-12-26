package com.user.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class BookContent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String contentType;
	private String content;
	
	@CreationTimestamp
	private LocalDateTime creationTime;
	
	@UpdateTimestamp
	private LocalDateTime updatedTime;
	
	@ManyToOne
	@JoinColumn(name="BookID", referencedColumnName="id")
	private Book book;
	
	
	public BookContent(Long id, String contentType, String content, LocalDateTime creationTime,
			LocalDateTime updatedTime, Book book) {
		super();
		this.id = id;
		this.contentType = contentType;
		this.content = content;
		this.creationTime = creationTime;
		this.updatedTime = updatedTime;
		this.book = book;
	}


	public BookContent() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContentType() {
		return contentType;
	}


	public void setContentType(String contentType) {
		this.contentType = contentType;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public LocalDateTime getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}


	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(LocalDateTime updatedTime) {
		this.updatedTime = updatedTime;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "BookContent [id=" + id + ", contentType=" + contentType + ", content=" + content + ", creationTime="
				+ creationTime + ", updatedTime=" + updatedTime + ", book=" + book + "]";
	}
	
	
}
