package com.cloudstorageapi.api.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "leela_files")
public class FileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "file_id", nullable = false)
	private int fileId;
	@Column(name = "user_id", nullable = false)
	private int UserId;
    @Column(name = "file_name", nullable = false,length=250)
	private String fileName;
    @Column(name = "file_size", nullable = false)
	private long fileSize;
    @Column(name = "file_type", nullable = false)
	private String fileType;
    @Column(name = "storage_path", nullable = false,length=250)
   	private String storagePath;
    @Column(name = "upload_date", nullable = false)
	private Timestamp uploadDate;
	@Column(name = "is_shared", nullable = false)
	private boolean isShared;
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getStoragePath() {
		return storagePath;
	}
	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}
	public Timestamp getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}
	public boolean isShared() {
		return isShared;
	}
	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}
	
	
}
