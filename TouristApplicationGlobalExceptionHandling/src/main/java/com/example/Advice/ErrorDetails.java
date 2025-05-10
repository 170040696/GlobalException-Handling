package com.example.Advice;

import java.time.LocalDateTime;

public class ErrorDetails {

	private String status;
	
	private String message;
	
	private LocalDateTime localtime;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getLocaltime() {
		return localtime;
	}

	public void setLocaltime(LocalDateTime localtime) {
		this.localtime = localtime;
	}

	public ErrorDetails(String status, String message, LocalDateTime localtime) {
		super();
		this.status = status;
		this.message = message;
		this.localtime = localtime;
	}

	@Override
	public String toString() {
		return "ErrorDetails [status=" + status + ", message=" + message + ", localtime=" + localtime + "]";
	}

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
