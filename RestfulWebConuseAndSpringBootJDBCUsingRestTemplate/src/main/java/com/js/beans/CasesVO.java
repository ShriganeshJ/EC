package com.js.beans;

import java.io.Serializable;

public class CasesVO implements Serializable
{
	public String userId;
	public String id;
	public String title;
	public String completed;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "CasesVO [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

}
