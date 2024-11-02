package com.cloudstorageapi.api.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "leela_folders")
public class FolderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "folder_id", nullable = false)
	private int folderId;
	@Column(name = "user_id", nullable = false)
	private int UserId;
    @Column(name = "folder_name", nullable = false,length=250)
	private String folderName;
    @Column(name = "folder_size", nullable = false)
	private long folderSize;
    @Column(name = "folder_type", nullable = false)
	private String folderType;
    @Column(name = "storage_path", nullable = false,length=250)
   	private String storagePath;
    @Column(name = "upload_date", nullable = false)
	private Timestamp uploadDate;
	@Column(name = "is_shared", nullable = false)
	private boolean isShared;
	public int getFolderId() {
		return folderId;
	}
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public long getFolderSize() {
		return folderSize;
	}
	public void setFolderSize(long folderSize) {
		this.folderSize = folderSize;
	}
	public String getFolderType() {
		return folderType;
	}
	public void setFolderType(String folderType) {
		this.folderType = folderType;
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
