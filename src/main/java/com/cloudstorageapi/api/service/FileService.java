package com.cloudstorageapi.api.service;

 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.cloudstorageapi.api.entity.FileEntity;
import com.cloudstorageapi.api.model.FileIdRequest;
import com.cloudstorageapi.api.model.FileRequestBody;
import com.cloudstorageapi.api.repositories.FileRepository;

@Service
public class FileService  {

	@Autowired
	private  FileRepository FileRepository;

	

	public FileEntity createFile(FileRequestBody FileRequestBodyObj) {

		FileEntity newFile = new FileEntity();
		newFile.setFileName(FileRequestBodyObj.getFileName());
		//newFile.setFileId(FileRequestBodyObj.getParentFileId());
		//newFile.setCreatedAt(FileRequestBodyObj.getCreatedAt());
	 
		return FileRepository.save(newFile);		 
	}

	public FileEntity updateFile(FileRequestBody FileRequestBodyObj) {
		FileEntity newFile = new FileEntity();
		newFile.setFileId(FileRequestBodyObj.getFileId() );
		newFile.setFileName(FileRequestBodyObj.getFileName());
		//newFile.setFileId(FileRequestBodyObj.getParentFileId());
		//newFile.setCreatedAt(FileRequestBodyObj.getCreatedAt());
		return FileRepository.save(newFile);		 
	}

	public Page<FileEntity> listallusersfromdb(int pageNumber, int size) {
		Pageable pageable = PageRequest.of(pageNumber, size);
		return FileRepository.listallusersfromdb(pageable);
	}
 
	public String deleteFile(FileIdRequest fld) {
		int FileId= fld.getfileId();
		FileRepository.deleteById(FileId);
		return "File Deleted";
	}

	public String countNumberOfFiles() {

		return FileRepository.countNumberOfFiles();
	}

}
