package com.user.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class BookSubscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String subname;
	
	@Enumerated(EnumType.STRING)
	private Role subrole;
	
	private Boolean isSubscribed;
	
	@CreationTimestamp
	private LocalDateTime createdTime;
	
	@UpdateTimestamp
	private LocalDateTime updatedTime;
	
	@ManyToOne
	@JoinColumn(name="BookID", referencedColumnName="id")
	private Book book;
	
	
	public BookSubscription(Long id, String subname, Role subrole, Boolean isSubscribed, LocalDateTime createdTime,
			LocalDateTime updatedTime, Book book) {
		super();
		this.id = id;
		this.subname = subname;
		this.subrole = subrole;
		this.isSubscribed = isSubscribed;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.book = book;
	}
	public BookSubscription() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Role getSubrole() {
		return subrole;
	}
	public void setSubrole(Role subrole) {
		this.subrole = subrole;
	}
	public Boolean getIsSubscribed() {
		return isSubscribed;
	}
	public void setIsSubscribed(Boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookSubscription [id=" + id + ", subname=" + subname + ", subrole=" + subrole + ", isSubscribed="
				+ isSubscribed + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", book=" + book
				+ "]";
	}
	

}
