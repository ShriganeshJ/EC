package com.js.beans;

public class CasesBO {

	public int userId;
	public int id;
	public String title;
	public boolean completed;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "CasesVO [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

}
