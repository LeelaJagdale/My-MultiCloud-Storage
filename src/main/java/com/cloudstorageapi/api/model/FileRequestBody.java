package com.cloudstorageapi.api.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FileRequestBody {
 
	private int fileId;

	 
	private String fileName;
	 
	private int parentfileId;
	  
	private int createdAt;

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getParentfileId() {
		return parentfileId;
	}

	public void setParentfileId(int parentfileId) {
		this.parentfileId = parentfileId;
	}

	public int getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}

	
}
