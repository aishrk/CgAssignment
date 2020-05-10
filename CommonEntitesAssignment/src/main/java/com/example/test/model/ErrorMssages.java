package com.example.test.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@XmlRootElement

public class ErrorMssages {

	private String errorCode;
	private String errorMssage;
	private String document;
	public ErrorMssages(String errorCode, String errorMssage, String document) {
		super();
		this.errorCode = errorCode;
		this.errorMssage = errorMssage;
		this.document = document;
	}
	public ErrorMssages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMssage() {
		return errorMssage;
	}
	public void setErrorMssage(String errorMssage) {
		this.errorMssage = errorMssage;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	@Override
	public String toString() {
		return "ErrorMssages [errorCode=" + errorCode + ", errorMssage=" + errorMssage + ", document=" + document + "]";
	}
	
	
}
